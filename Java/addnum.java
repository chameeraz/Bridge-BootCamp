import java.util.Scanner;

public class Addnum{
	public static void main (String args[]){ 
		
		int num1; 	
		int num2;
		int add;
		Scanner input= new Scanner(System.in); 
		
		System.out.print("Enter 1st number : "); 
		num1 = input.nextInt();


		 
		System.out.print("Enter 2nd number : "); 		
		num2= input.nextInt();

		add= num1+num2;

		
	
		System.out.println("The Sum of "+num1+" and "+num2+" is "+add); 
	}
}