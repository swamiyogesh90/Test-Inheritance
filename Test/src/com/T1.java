package com;

public class T1 {

	public static void main(String args[]) {
		
		T1 t = new T1();
	}

	private final int x;

	{
		printX();
		x = 7;
		printX();
	}

	private void printX() {
		System.out.println("Value of X is :: " + x);

	}

}
