/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: user input
**************************************************/


import java.util.Scanner;

public class nameage{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		String name;
		int age;

		// get the user inputs

		System.out.print("Enter your name : ");
		name = s.next();

		System.out.print("Enter your age : ");
		age = s.nextInt();
	
	

		//output

		System.out.println("Hello "+name+"!! You are "+age+" years old !");

	}
}