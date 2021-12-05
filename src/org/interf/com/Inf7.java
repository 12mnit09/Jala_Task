package org.interf.com;

public interface Inf7 {
	
	int i=9;
	String name="Raghul";
	
    default void rte() 
    {
    	System.out.println("Default Method in Interface");
    }
}
