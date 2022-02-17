/**************************************************
Program: Bridge Boot Camp Tech Session 
Lab Num: Java Programming 
Author: Chameera Mayura
Purpose:
**************************************************/


import java.util.Scanner;

public class student{
	
	String name;
	int age;


	void setData(){
	name="kamal";
	age = 30;

	
	}
	
	void setData(String name, int age){
	this.name=name;
	this.age = age;		
	}
	
	String greet(){
	String s = "hello "+ name;
	s += " your age is " +age;
	return s;
	}	
}