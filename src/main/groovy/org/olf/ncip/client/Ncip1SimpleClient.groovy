package org.olf.ncip.client;

import javax.annotation.PostConstruct
import groovy.json.JsonSlurper
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovyx.net.http.ContentType
import groovy.json.JsonOutput;
import groovy.json.JsonBuilder;
import java.net.HttpURLConnection;
import java.io.DataOutputStream

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
      println("v102");

      HTTPBuilder http = new HTTPBuilder(this.getAddress())

      http.request(Method.POST, ContentType.TEXT) { req ->

        // headers.accept = 'application/xml'
        // requestContentType=ContentType.XML
        requestContentType='text/xml'
        // headers.'User-Agent' = 'curl/7.64.0 '
        headers : [Accept : 'application/xml']

        // try request the response as ContentType.TEXT instead of ContentType.XML
        contentType: ContentType.TEXT
        
          // We definitelt DO NOT want the XML declaration - will cause at least some servers to choke
          // mkp.xmlDeclaration()

        body =  {
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

        response.success = { resp, reader ->
          resp.headers.each { h -> System.out.println("${h}"); }
          println("Result: ${resp.data.text}");
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


  private String doBadlyBehavedPost() {
    String urlParameters  = "param1=a&param2=b&param3=c";
    byte[] postData       = urlParameters.getBytes( StandardCharsets.UTF_8 );
    int    postDataLength = postData.length;
    String request        = "http://example.com/index.php";
    URL    url            = new URL( request );
    HttpURLConnection conn= (HttpURLConnection) url.openConnection();           
    conn.setDoOutput( true );
    conn.setInstanceFollowRedirects( false );
    conn.setRequestMethod( "POST" );
    conn.setRequestProperty( "Content-Type", "application/xml"); 
    conn.setRequestProperty( "charset", "utf-8");
    conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
    conn.setUseCaches( false );
    try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
       wr.write( postData );
    }
  }
}
