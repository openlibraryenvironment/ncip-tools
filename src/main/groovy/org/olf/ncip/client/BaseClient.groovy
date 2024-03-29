package org.olf.ncip.client;

import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovyx.net.http.ContentType

public abstract class BaseClient implements  NcipClient {

  protected String address;

  /**
   *  Construct a new NCIP client given an address of the form hostname:port
   */
  public BaseClient(String address) {
    this.address = address;
  }

  HTTPBuilder getSession() {
    HTTPBuilder http = new HTTPBuilder(address)
    return http;
  }

  public String getAddress() {
   return address;
  }

  abstract Object lookupUser(String user_id_to_lookup);
  abstract Object lookupItem();
  abstract Object createUser();
}
