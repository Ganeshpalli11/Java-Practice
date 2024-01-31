package com.kodnest.control_construct;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				count=1;
			}
				
			}
		if(count==0) {
			System.out.println("yes");
		}
		else if(count==1) {
			System.out.println("no");
		}
		
		}
		

	}


