package com.kodnest.control_construct;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter number n1");
int n1=scan.nextInt();
System.out.println("enter number n2");
int n2=scan.nextInt();
int gcd=1;
	for(int i=2;i<=n1 && i<=n2;i++) {
		if(n1%i==0 && n2%i==0) {
			gcd=i;
		}
		
	}
	System.out.println(gcd);
}
}