package org.progjava.ch1;

public class Result {
  private int result;
  private boolean isEven;

  public Result(int result, boolean isEven){
    this.setResult(result);
    this.setEven(isEven);	    
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setEven(boolean isEven) {
    this.isEven = isEven;
  }

  public boolean isEven() {
    return isEven;
  }
}