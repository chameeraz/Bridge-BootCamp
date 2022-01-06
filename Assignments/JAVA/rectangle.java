/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:  rectangle
**************************************************/


import java.util.Scanner;

public class  rectangle{
	public static void main (String args[]){ 
	Scanner x = new Scanner(System.in);
// variable declaration
		float height;
		float  perimeter;
		float width;
		float area;

// get the user inputs
		System.out.print("Enter Height  : "); 
		height= x.nextFloat();

		System.out.print("Enter width: "); 
		width= x.nextFloat();


//  process - do the calculation
		perimeter = 2 * (height + width);
		area = height * width;


//output
	System.out.println(" Perimeter :"+perimeter);
	System.out.println("Area  : "+area); 
	
	}
}