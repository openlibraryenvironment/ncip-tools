package org.olf.ncip.client;

public class BaseClient implements  NcipClient {
  
  abstract Map lookupUser();
  abstract Map lookupItem();
  abstract Map createUser();
}
