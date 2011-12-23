package org.progjava.ch1;

public class SimpleLookup implements Lookup {
  private int MAX_SIZE = 100;
  private String[] names = new String[MAX_SIZE];
  private Object[] values = new Object[MAX_SIZE];;
  private int numItems = 0;
  
  @Override
  public Object find(String name) {
    // TODO Auto-generated method stub
    for(int i = 0; i < names.length; i++){
      if(names[i].equals(name)){
        return values[i];
      }
    }
    return null;
  }

  @Override
  public void add(String name, Object value) throws Exception {
    // TODO Auto-generated method stub
    if(numItems >= 100){
      throw new Exception("array is full");
    }
    names[numItems] = name;
    values[numItems] = value;
    numItems++;
  }

  @Override
  public void remove(String name) throws Exception {
    // TODO Auto-generated method stub
    int i = 0;    
    
    if(numItems <= 0){
      throw new Exception("array is empty");
    }
            
    numItems++;
    for(i = 0; i < names.length; i++){
      if(names[i].equals(name)){
        names[i] = null;
        values[i] = null;
        break;
      }
    }
    
    for(int j = i+1; j < numItems; j++){
      names[i-1] = names[i];
      values[i-1] = values[i-1];
    }
    
    names[numItems] = null;
    values[numItems] = null;
    numItems--;
    
  }
  
  public static void main(String[] args){
    
  }
}
