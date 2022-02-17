/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:
**************************************************/


import java.util.Scanner;

public class StudentUser{
	public static void main(String args[]){

	String name;
	int age;
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Name :");
	name = input.next();

	System.out.print("Enter Age :");
	age = input.nextInt();
	

	// created the object
	student student1 = new student();

	// call the method
	student1.setData(name,age);
	
	System.out.println(student1.greet());
	
}
}