package com.kodnest.control_construct;
import java.util.Scanner;
public class PeopleCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter age");
int age=scan.nextInt();
if(age<=12) {
	System.out.println("child");
}
else if(age>=13 && age<=19) {
	System.out.println("Teen");
}
else if(age>=20 && age<=59) {
	System.out.println("Adult");
}
else if(age>=60) {
	System.out.println("Senior");
}
	}

}
