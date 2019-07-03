package org.olf.ncip.client;

import org.olf.ncip.schema.NCIPMessage;
import org.olf.ncip.schema.LookupUser;
import org.olf.ncip.schema.UserId;
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

  public Ncip202Client(String address) {
    super(address);
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

    return new JsonBuilder(wrapped_message)
  }

  Object lookupItem() {
    return [:]
  }

  Object createUser() {
    return [:]
  }

  public send(NCIPMessage message) {

    NCIPMessage response = null;

    if ( address ) {

      HTTPBuilder http = new HTTPBuilder(address)

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
            // resp.headers.each { h -> logger.debug("${h}"); }
            String txt = reader.text
            Unmarshaller u = ctx.createUnmarshaller();
            NCIPMessage response_msg = u.unmarshal(new ByteArrayInputStream(txt.getBytes()))
            response = response_msg;
          }

          response.failure = { resp ->
            system.err.println("ISO18626 call failed: ${resp.status}");
          }

        }
      }
      catch ( Exception e ) {
        System.err.println("problem marshalling XML",e);
      }
    }
    else {
      System.err.println("NO address in message payload header ${message_header}");
    }

    return response;
  }

}
