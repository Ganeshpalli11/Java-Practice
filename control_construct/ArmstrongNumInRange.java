package com.kodnest.control_construct;

import java.util.Scanner;

public class ArmstrongNumInRange {

		// TODO Auto-generated method stub
		public static int countDigit(int n) {
			
			int lastDigit=0;
			int num=n;
			int count=0;
			while(num>0) {
				lastDigit=num%10;
				num=num/10;
				count++;
					
				}
			return count;
		}

		public static int armstrong(int n) {
			
			int lastDigit=0;
			int num=n;
			int arm=0;
			int digitCount=countDigit(num);
			while(num>0) {
				lastDigit=num%10;
			    arm = (int) (arm + Math.pow(lastDigit,digitCount ));
			    num=num/10;	
				}
			return arm;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("ENTER NUM");
			int num=scan.nextInt();
			
			for(int i=1;i<=num;i++) {
				if(armstrong(i)==i) {
					System.out.print(i+" ");
				}
			}


	}

}
