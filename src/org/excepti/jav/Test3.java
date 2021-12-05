package org.excepti.jav;

public class Test3 {
	
	public void pro() throws Exception 
	{
		throw new Exception(); 
	}
	
	public static void main(String[] args) throws Exception  {
		
		Test3 t = new Test3();
		t.pro();
		
	}

}
