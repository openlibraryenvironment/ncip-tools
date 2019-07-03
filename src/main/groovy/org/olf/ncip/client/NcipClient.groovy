package org.olf.ncip.client;

public interface NcipClient {
  
  Object lookupUser(String user_id_to_lookup);
  Object lookupItem();
  Object createUser();
}
