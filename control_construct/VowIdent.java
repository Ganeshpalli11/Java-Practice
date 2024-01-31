package com.kodnest.control_construct;
import java.util.Scanner;

public class VowIdent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter Vowel");
char ch=scan.next().charAt(0);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  {
	System.out.println("LowerCase vowel");
	
}
else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')  {
	System.out.println("UpperCase vowel");
	
}
else {
	System.out.println("Enter vowels in upper or lower case");
}
	}

}
