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
    Object result = null;
    try {
      HTTPBuilder http = new HTTPBuilder(this.getAddress())

      http.request(Method.POST) { req ->

        // headers.accept = 'application/xml'
        // requestContentType=ContentType.XML
        requestContentType='text/xml'
        // headers.'User-Agent' = 'curl/7.64.0 '

        // try request the response as ContentType.TEXT instead of XML
        contentType: ContentType.XML

        body =  {
          // We definitelt DO NOT want the XML declaration - will cause at least some servers to choke
          // mkp.xmlDeclaration()
          NCIPMessage(version:'http://www.niso.org/ncip/v1_0/imp1/dtd/ncip_v1_0.dtd') {
            LookupUser {
              InitiationHeader {
                FromAgencyId {
                  UniqueAgencyId {
                    Value ('caiatns')
                  }
                }
                ToAgencyId {
                  UniqueAgencyId {
                    Value ('caiatns')
                  }
                }
                ApplicationProfileType {
                  Value ( 'caiatns' )
                }
              }
              VisibleUserId {
                VisibleUserIdentifierType {
                  Scheme('string')
                  Value('barcode')
                }
                VisibleUserIdentifier(the_userid_to_lookup)
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

    return result;
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

}
