package com.kodnest.control_construct;

import java.util.Scanner;

public class SumUptoSingleDigit {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a number");
			int n=scan.nextInt();
			System.out.println(sumDigits1(n));
		}
			public static int sumDigits(int n) {
			
			int lastDigit=0;
			int num=n;
			int sum=0;
			while(num>0) {
				lastDigit=num%10;
				num=num/10;
				sum=sum+lastDigit;
					
				}
			return sum;
				
			}
			public static int sumDigits1(int n) {
			int m=sumDigits(n);
			while(m>9) {
				 m=sumDigits(m);
			}
			return m;
			
	}

}
