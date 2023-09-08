package boiler;

import java.util.Scanner;

public class Boiler {

	public static void main(String args[]) {
		System.out.println("enter  a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		Palindrome p1=new Palindrome();
		boolean res=p1.checkPalindrome(a);
		if(res) {		
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}
		

	}

}
