/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: Calculate sales rep value
**************************************************/


import java.util.Scanner;

public class sales{
	public static void main (String args[]){ 

// variable declaration
		int nou; 	
		int uPrice;
		
		int salesv;
		float avg;
// to get the user input
		Scanner input= new Scanner(System.in); 

// get the user inputs
		System.out.print("Enter No of units  : "); 
		nou = input.nextInt();


		 
		System.out.print("Enter Unit Price   : "); 		
		uPrice= input.nextInt();
		
//  process - do the calculation
		salesv=nou* uPrice;
		

//output
		System.out.println("The Sales value of each rep "+salesv); 
	}
}