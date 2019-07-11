package org.olf.ncip.client;

import javax.annotation.PostConstruct
import groovy.json.JsonSlurper
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovyx.net.http.ContentType
import groovy.json.JsonOutput;
import groovy.json.JsonBuilder;


/**
 * This version of the client does not use the JAXB marshallers, but instead constructs the
 * XML manually - currently evaluating the two options to decide which works best
 */
public class Ncip1SimpleClient extends  BaseClient {

  public Ncip1SimpleClient(String addr) {
    super(addr);
  }
  
  Object lookupUser(String the_userid_to_lookup) {
    try {
      HTTPBuilder http = new HTTPBuilder(this.getAddress())

      http.request(Method.POST, ContentType.TEXT) { req ->

        headers.accept = 'application/xml'

        requestContentType=ContentType.XML
        body =  {
          mkp.xmlDeclaration()
          NCIPMessage(version:'http://www.niso.org/ncip/v1_0/imp1/dtd/ncip_v1_0.dtd') {
            LookupUser {
              InitiationHeader {
                FromAgencyId {
                  UniqueAgencyId {
                    Value (caiatns)
                  }
                }
                ToAgencyId {
                  UniqueAgencyId {
                    Value ('caiatns')
                  }
                }
              }
              ApplicationProfileType {
                Value ( 'caiatns' )
              }
            }
          }
        }

        response.success = { resp, xml ->
          resp.headers.each { h -> System.out.println("${h}"); }
          println("Result: ${xml}");
        }

        response.failure = { resp ->
          system.err.println("ISO18626 call failed: ${resp.status}");
        }

      }

    }
    catch ( Exception e ) {
      e.printStackTrace()
    }
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
