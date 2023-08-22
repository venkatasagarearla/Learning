package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateFactorial(n);
	}
	public static void calculateFactorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	          
		}
		System.out.println(fact);
	}

}
