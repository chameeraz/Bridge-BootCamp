/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: class teacher marks
**************************************************/


import java.util.Scanner;

public class classmarks{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		int sub1;
		int sub2;
		int sub3;
		int sum;
		int avg;
		// get the user inputs

		System.out.print("Enter marks for module 1 : ");
		sub1 = s.nextInt();

		System.out.print("Enter marks for module 2 : ");
		sub2 = s.nextInt();

		System.out.print("Enter marks for module 3 : ");
		sub3 = s.nextInt();

		
		//Process
			
		sum=sub1+sub2+sub3;
		avg = sum/3;
	
	

		//output

		System.out.println("Total Marks :"+sum);
		System.out.println("Average :"+avg);
		}
}