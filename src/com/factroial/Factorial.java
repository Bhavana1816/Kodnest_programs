package com.factroial;

public class Factorial {

	public static void main(String[] args) {
		int num = 5, fact = 1;
		for (int i = num; i >=1; i--) {
			fact = fact * i;

		}
		System.out.println("The fact of given number" + num + "=" + fact);
	}

}
