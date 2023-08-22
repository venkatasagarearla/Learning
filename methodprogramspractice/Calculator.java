package methodprogramspractice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("enter a operator");
		char  operator=scan.next().charAt(0);
		scan.close();

		 Calculator c1=new  Calculator();
		 c1.operations(operator,a, b);
		}
		void operations(char operator,int a,int b) {
			
		switch(operator) {
		case '+':
			System.out.println("the adittion of two numbers is "+(a+b));
			break;
		case '-':
			System.out.println("the subtraction of two numbers"+(a-b));
			break;
		case '*':
			System.out.println("the multiplication of two numbers is"+(a*b));
			break;
		case '/':
			if(b!=0) {    
				
			
			System.out.println("the division of two numbers"+(a/b));
			}else {
				System.out.println("division by zero is not possibe");
			}
			break;
		default:
			System.out.println("operations can't be performed ");
		
		}
	}

}
