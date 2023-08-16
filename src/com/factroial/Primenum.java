
package com.factroial;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		boolean isprime=true;
		int num = sc.nextInt();
		for(int  i=2 ; i<num;i++) {
			if(num%i==0) {
				isprime= false;
				break;
			}
		}
		if(isprime) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime");
		}

	}

}
