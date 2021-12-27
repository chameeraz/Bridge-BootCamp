import java.util.Scanner;

public class HelloName{
	public static void main (String args[]){ 
		// variable declaration 
		String name;  // this will create a placeholder in the memory to hold the name		
		int age;
		Scanner input= new Scanner(System.in);  // to get an input through the command line
		
		System.out.print("Please Enter your Name : "); 
	name = input.next();


		Scanner inputage= new Scanner(System.in);  // to get an input through the command line
		System.out.print("Please enter your age :"); 		
		age= inputage.nextInt();
		
	
		System.out.println("Hello "+name + " you are " +age+ " years old now!"); 
	}
}