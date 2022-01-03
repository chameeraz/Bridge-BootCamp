/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: Calculate commis
**************************************************/


import java.util.Scanner;

public class salary{
	public static void main (String args[]){ 

// variable declaration
		int nou; 	
		int uPrice;
		
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
		
// selection
		if(salesv>25000){
		commis=salesv*25/100;
		System.out.println("The Sales value of each rep "+salesv);
		System.out.println("The Commission is "+commis);
		}
		else{
		System.out.println("The Sales value of each rep "+salesv); 
		
		}

//output
		
	}
}