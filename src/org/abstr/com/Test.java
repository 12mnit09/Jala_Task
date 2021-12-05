package org.abstr.com;

public class Test extends Abs {

	@Override
	void run() {
		System.out.println("This is Sub class");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.run();
		t.play();
		
	}

}
