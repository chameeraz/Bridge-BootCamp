/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:
**************************************************/


import java.util.Scanner;

public class temp{
	public static void main (String args[]){ 

// variable declaration
		
		double temp;
		
// to get the user input
		Scanner s= new Scanner(System.in); 
		
		System.out.print("Fahrenheit:");
		temp = s.nextDouble();
		
	
	
	double celci= (temp-32)*5/9;		
	
	System.out.println("Celcius :"+celci); 
	

	
	}
}