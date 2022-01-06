/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: user input
**************************************************/


import java.util.Scanner;

public class userinput{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		String name;

		// get the user inputs

		System.out.print("Enter your name : ");
		name = s.next();
	
	

		//output

		System.out.println("Hello "+name+);

	}
}