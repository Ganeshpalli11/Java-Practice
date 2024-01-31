package com.kodnest.control_construct;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number n");
		int num=scan.nextInt();
		int lastDigit=0;
		int sum=0;
		while(num>0) {
			lastDigit=num%10;
			num=num/10;
			sum=sum+lastDigit;
			
		}
System.out.println(sum);
	}

}
