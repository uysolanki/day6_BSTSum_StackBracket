package stackParenthesis;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter expression");
		String input=sc.next();
		
		MyStack ms=new MyStack();
		if(input.length()%2==1)
		{
			System.out.println("Incomplete Expression");
		}
		else
		{
			if(ms.validate(input))
				System.out.println("Valid Expression");
			else
				System.out.println("Invalid Expression");
		}
		

	}

}
