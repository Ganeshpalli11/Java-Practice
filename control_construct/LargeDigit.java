package com.kodnest.control_construct;

import java.util.Scanner;

public class LargeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n:");
		int num=scan.nextInt();
		int lastDigit=0;
		int palindrome=0;
		int n=num;
		int large=0;
		while(n>0) {
			lastDigit=n%10;
			n=n/10;
			if(large<lastDigit) {
				large=lastDigit;
			}
		
		}
System.out.println(large);
	}

}
