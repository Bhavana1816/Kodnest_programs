package com.factroial;

import java.util.Scanner;

public class Ambsyrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();int temp=num;
		int sum = 0;int  r;
		while(num>0) {
			r=num%10;
					r= r*r*r;
			sum+=r;
			num /=10;
		}
		if(sum==temp) {
			System.out.println("abmstrong number");
		}
		else {
			System.out.println("Not a Ambstrong number");
		}

	}

}
