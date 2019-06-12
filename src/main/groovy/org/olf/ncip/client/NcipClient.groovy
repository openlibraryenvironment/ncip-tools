package org.olf.ncip.client;

public interface NcipClient {
  
  Map lookupUser();
  Map lookupItem();
  Map createUser();
}
