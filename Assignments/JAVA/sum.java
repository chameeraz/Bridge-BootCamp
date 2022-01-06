/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: user input
**************************************************/


import java.util.Scanner;

public class sum{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		int num1;
		int num2;
		int sum;
		// get the user inputs

		System.out.print("Enter 1st num : ");
		num1 = s.nextInt();

		System.out.print("Enter 2nd num : ");
		num2 = s.nextInt();

		//Process
			
		sum=num1+num2;
	
	

		//output

		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);

	}
}