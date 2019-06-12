package org.olf.ncip.schema;

public interface NcipClient {
  
  Map lookupUser();
  Map lookupItem();
  Map createUser();
}
