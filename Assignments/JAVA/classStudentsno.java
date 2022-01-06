/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose: Class grades for any no of students
**************************************************/


import java.util.Scanner;

public class classstudentsno{
	public static void main (String args[]){
		int x=0;
		// to get the user input
		Scanner n = new Scanner(System.in);
		System.out.print("How many Students ? : ");
		int i = n.nextInt();


		// loop 

		while(x<i){
		// to get the user input
		Scanner s = new Scanner(System.in);
		
		// variable declaration
		
		int sub1;
		int sub2;
		int sub3;
		int sum;
		double avg;
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






		//decission

		if(100>avg && avg>80){
			System.out.println("Student has a Distinction Pass");
		}
		else if(79>avg && avg>70){
			System.out.println("Student has a Very Good Pass");
		}
		else if(69>avg && avg>60){
			System.out.println("Student has a Credit Pass");
		}
		else if(59>avg && avg>50){
			System.out.println("Student is Pass");
		}
		else{
			System.out.println("Student is Fail");
		}

		
		x++;
		}

		



		}
}