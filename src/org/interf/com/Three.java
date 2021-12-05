package org.interf.com;

public class Three implements C {

	public static void main(String[] args) {

		C c = new Three();
		c.pri();
		c.pro();
	}

	@Override
	public void pri() {

		System.out.println("Printing");
	}

	@Override
	public void pro() {
		System.out.println("Protection");
	}

}
