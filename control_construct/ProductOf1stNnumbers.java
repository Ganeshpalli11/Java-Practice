package com.kodnest.control_construct;

import java.util.Scanner;

public class ProductOf1stNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number upto product of odd number you want");
		int n=scan.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
			mul=mul*i;
		}
			}
		System.out.print("Product= "+mul);
	}
}


