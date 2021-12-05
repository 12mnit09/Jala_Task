package org.excepti.jav;

public class Test4 {

	public static void main(String[] args) {

		try {
			int i = 100;
			int j = 0;
			float f = i / j;

		} catch (ArithmeticException e) {
			System.out.println("Arithmentic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayindexout of bound exception Exception");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index out of bound exception Exception");
		} catch (Exception e) {
			System.out.println("Normal Exception");
		}

	}

}
