package gcd;

import java.util.Scanner;

public class GCD {
	public static void findGcd(int a,int b) {
		
			while(b!=0) {
				int res=a%b;
				a=b;
				b=res;							
		}
			System.out.println(a);
			
		
	}
	
public static void main(String[] args) {
	System.out.println("enter 2  numbers");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	scan.close();
	findGcd(a, b);
}
}
