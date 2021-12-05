package org.thissupr.com;

public class Test7 {

	public void f_methid(String name, String area) {

		System.out.println("First method");
		System.out.println(name+" "+area);
		this.s_methid();
	}
	public void s_methid() {

		System.out.println("Super class second Method");
	}
	
	
}
