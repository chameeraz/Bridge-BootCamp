/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: Calculate commis+final salary
**************************************************/


import java.util.Scanner;

public class salary{
	public static void main (String args[]){ 

// variable declaration
		int nou; 	
		int uPrice;
		float finalsalary;
		int salesv;
		float commis;
// to get the user input
		Scanner input= new Scanner(System.in); 

// get the user inputs
		System.out.print("Enter No of units  : "); 
		nou = input.nextInt();


		 
		System.out.print("Enter Unit Price   : "); 		
		uPrice= input.nextInt();


		
//  process - do the calculation
		salesv=nou* uPrice;
		finalsalary=salesv;
// selection
		if(salesv>50000){
		commis=salesv*10/100;
		finalsalary=commis+salesv;
		System.out.println("The Sales value of each rep "+salesv);
		System.out.println("The Commission is "+commis);
		System.out.println("The Commission is "+commis);
		}
		else{

		System.out.println("The Salary is "+finalsalary); 
		
		}

//output
		
	}
}