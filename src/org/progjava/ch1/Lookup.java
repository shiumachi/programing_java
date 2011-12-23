package org.progjava.ch1;

public interface Lookup {
  Object find(String name);
  
  void add(String name, Object value) throws Exception;
  
  void remove(String name) throws Exception;
}
