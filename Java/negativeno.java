/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:
**************************************************/


import java.util.Scanner;

public class negativeno{
	public static void main (String args[]){ 

// variable declaration
		int no=0; 
		int sum=0;
		float avg;	
		int x=0;

// to get the user input
		Scanner s= new Scanner(System.in); 



//output
	
	
// get the user inputs
		
		
		while(no>=0){
		System.out.print("Enter No   : "); 
		no = s.nextInt();
			
		x++;				
		sum=sum+no;					
					
		}
			
			sum=sum+no;
			avg=sum/x;
			System.out.println("count :"+x); 
			System.out.println("sum :"+sum); 
			System.out.println("average :"+avg); 

	
	}
}