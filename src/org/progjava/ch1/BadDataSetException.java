package org.progjava.ch1;

import java.io.IOException;

public class BadDataSetException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 3581657866328021538L;
  private String dataSetName;
  private IOException ioe;
  
  public BadDataSetException(String dataSetName, IOException ioe) {
    super();
    this.dataSetName = dataSetName;
    this.ioe = ioe;
  }

  
}
