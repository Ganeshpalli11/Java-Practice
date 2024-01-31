package com.kodnest.control_construct;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n:");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=(int) (sum+(Math.pow(i,2)));
		}
		System.out.println(sum);
	}

}
