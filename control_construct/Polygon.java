package com.kodnest.control_construct;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of sides");
		int sides=scan.nextInt();

	
	switch(sides) {
	case 3:
		System.out.println("TRAINGLE");
		break;
	case 4:
		System.out.println("Quadrilateral");
		break;
	case 5:
		System.out.println("PENTAGON");
		break;
	case 6:
		System.out.println("HEXAGON");
		break;
	case 7:
		System.out.println("SEPTAGONG");
		break;
	case 8:
		System.out.println("OCTAGON");
		break;
	case 9:
		System.out.println("GEGAGON");
		break;
	default:
		System.out.println("POLYGON");
		break;
	
	
	
	}

}
}