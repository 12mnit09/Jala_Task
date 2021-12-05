package org.operators.java;

public class Pro_1 {
	
	static void add(int a,int b) 
	{
		int c=0;
		c=a+b;
		System.out.println("Addition value is:"+c);
		
	}
	static void sub(int a, int b)
	{

		int c=0;
		c=a-b;
		System.out.println("Subtracted value is:"+c);
	}

	static void mul(long a, long b) 
	{
		long c=0;
		c=a*b;
		System.out.println("Multiplied value is:"+c);
		
	}
	static void div(long a, long b) {

		long c=0;
		c=a/b;
		System.out.println("Divided value is:"+c);
		
	}
	public static void main(String[] args) {
		
		add(2, 3);
		sub(3456, 3254);
		mul(34, 45);
		div(1000,100);
		
	}
}
