package org.olf.ncip.client;

import org.olf.ncip.v2schema.NCIPMessage;
import org.olf.ncip.v2schema.LookupUser;
import org.olf.ncip.v2schema.UserId;
import javax.annotation.PostConstruct
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller
import groovy.json.JsonSlurper
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovyx.net.http.ContentType
import groovy.json.JsonOutput;
import groovy.json.JsonBuilder;


public class Ncip202Client extends  BaseClient {

  public Ncip202Client(String addr) {
    super(addr);
  }
  
  Object lookupUser(String the_userid_to_lookup) {
    NCIPMessage lookup_user_msg = new NCIPMessage();
    LookupUser lookup_user_payload = new LookupUser();
    lookup_user_msg.setLookupUser(lookup_user_payload);
    

    // lookup_user_payload.setInitiationHeader(new InitiationHeader());
    UserId user_id = new UserId()
    user_id.setUserIdentifierValue(the_userid_to_lookup);

    lookup_user_payload.setUserId(user_id);

    NCIPMessage response = send(lookup_user_msg);

    return new JsonBuilder(response)
  }

  Object lookupItem() {
    return [:]
  }

  Object createUser() {
    return [:]
  }

  Object placeHold() {
    // Realised using ncip AcceptItem message
    return [:]
  }

  public send(NCIPMessage message) {

    NCIPMessage ncip_response_msg = null;

    if ( this.getAddress() ) {

      System.out.println("Send to ${this.getAddress()}");
      HTTPBuilder http = new HTTPBuilder(this.getAddress())

      try {
        StringWriter writer = new StringWriter();
        JAXBContext ctx = JAXBContext.newInstance(NCIPMessage.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.marshal(message, writer);
        String message_as_xml = writer.toString()

        http.request(Method.POST, ContentType.TEXT) { req ->

          headers.accept = 'application/xml'

          requestContentType=ContentType.XML
          body = message_as_xml

          response.success = { resp, reader ->
            resp.headers.each { h -> System.out.println("${h}"); }

            String txt = reader.text
            System.out.println(txt);

            Unmarshaller u = ctx.createUnmarshaller();
            NCIPMessage response_msg = u.unmarshal(new ByteArrayInputStream(txt.getBytes()))
            ncip_response_msg = response_msg;
          }

          response.failure = { resp ->
            system.err.println("ISO18626 call failed: ${resp.status}");
          }

        }
      }
      catch ( Exception e ) {
        System.err.println("problem marshalling XML");
        e.printStackTrace()
      }
      finally {
        System.out.println("http call completed");
      }
    }
    else {
      System.err.println("No address in message payload header");
    }

    return ncip_response_msg;
  }

}
