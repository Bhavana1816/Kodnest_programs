package com.factroial;

import java.util.Scanner;

public class Fibanconic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt() , nextNumber=0;
		int firstnum = 0, secondnum = 1;
		System.out.println(firstnum + " " +secondnum+" ");
		for(int i=3;i<=num;i++) {
			nextNumber = firstnum + secondnum;
			System.out.println(nextNumber);
			firstnum = secondnum;
			secondnum =nextNumber; 
			
		}

	}

}
