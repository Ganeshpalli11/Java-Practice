package com.kodnest.control_construct;
import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
int n=scan.nextInt();
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}
	}

}
