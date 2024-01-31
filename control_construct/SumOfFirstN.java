package com.kodnest.control_construct;
import java.util.Scanner;
public class SumOfFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number upto sum you want");
int n=scan.nextInt();
int sum=0;
for(int i=1;i<=n;i++) {
	sum=sum+i;
}
System.out.println("sum= "+sum);
	}

}
