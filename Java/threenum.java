import java.util.Scanner;

public class threenum{
	public static void main (String args[]){ 
		
		int num1; 	
		int num2;
		int num3;
		int add;
		float avg;
		Scanner input= new Scanner(System.in); 
		
		System.out.print("Enter 1st Module Marks : "); 
		num1 = input.nextInt();


		 
		System.out.print("Enter 2nd Module Marks  : "); 		
		num2= input.nextInt();
		System.out.print("Enter 3rd Module Marks  : "); 
		num3 = input.nextInt();

		add= num1+num2+num3;
		avg= add/3;
		
	
		System.out.println("The Average is "+avg); 
	}
}