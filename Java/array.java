/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:
**************************************************/


import java.util.Scanner;

public class array{
	public static void main (String args[]){ 

// variable declaration
		int numbers[] = new int[10];
		int total = 0;
		double avarage= 0.0;
// to get the user input
		Scanner s= new Scanner(System.in); 
		for(int i=0; i<0; i++)
		system.out.print("Enter Number :");
		numbers[i] = s.nextInt();
		}

		
	int i;
	for(i=0; i<10; i++){
	system.out.println("Number :"+i);
	total=total+ numbers[i];
		}
	
	average = total/i;		
	
	System.out.println("Total :"+total); 
	System.out.println("average :"+average); 

	
	}
}