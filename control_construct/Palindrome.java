package com.kodnest.control_construct;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n:");
		int num=scan.nextInt();
		int lastDigit=0;
		int palindrome=0;
		int n=num;
		while(n>0) {
			lastDigit=n%10;
			palindrome=palindrome*10+lastDigit;
			n=n/10;
		}
if(palindrome==num) {
	System.out.println("yes it is a Palindrome");
}
else if(palindrome!=num) {
	System.out.println("no it is not a Palindrome");
}

	}

}

