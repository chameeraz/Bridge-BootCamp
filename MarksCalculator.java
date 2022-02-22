/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Rasika Alahakoon
Purpose: Calculate the total and the avegrage 
A description of the program/class goes here
**************************************************/
import java.util.Scanner;

public class MarksCalculator{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		int marks1;
		int marks2;
		int marks3;
		int totalMarks;
		double averageMarks;

		//int marks1, marks2, marks3;

		// get the user inputs
		System.out.print("Enter marks for module 1 : ");
		marks1 = s.nextInt();
		System.out.print("Enter marks for module 2 : ");
		marks2 = s.nextInt();
		System.out.print("Enter marks for module 3 : ");
		marks3 = s.nextInt();

		//  process - do the calculation
		
		totalMarks = marks1+marks2+marks3;
		averageMarks = totalMarks / 3;

		//output

		System.out.println("Total marks = "+totalMarks);	
		System.out.println("Average marks = "+averageMarks);	
	
	}
}