package com.kodnest.control_construct;
import java.util.Scanner;

public class Febinoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n upto febinocci series you want");
		int n=scan.nextInt();
		int n1=0,n2=1;
		
		int x=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++) {
			x=n1+n2;
			System.out.print(" "+x);
			n1=n2;
			n2=x;
			
		}
		System.out.println();

	}

}
