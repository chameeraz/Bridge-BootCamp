/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Rasika Alahakoon
Purpose: Calculate the sales value
A description of the program/class goes here
**************************************************/
import java.util.Scanner;

public class SalesValueCalculator{
	public static void main (String args[]){
		// to get the user input
		Scanner s = new Scanner(System.in);

		// variable declaration
		
		String salesRepName;
		int numberOfUnits;
		int unitPrice;
		double salesValue;

		
		// get the user inputs
		System.out.print("Enter sales rep name : ");
		salesRepName = s.next();
		System.out.print("Enter number of units sold : ");
		numberOfUnits = s.nextInt();
		System.out.print("Enter unit price : ");
		unitPrice = s.nextInt();
		
		//  process - do the calculation
		
		salesValue = numberOfUnits * unitPrice;

		//output

		System.out.println("The sales value of "+salesRepName+" is Rs."+ salesValue);	
			
	}
}