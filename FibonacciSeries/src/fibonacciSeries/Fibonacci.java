package fibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
public static void Fibonacciseries(int n) {
	int num1=0;
	int num2=1;
	if(n==1) {
		System.out.println(num1);
		
	}
	else if(n==2) {
		System.out.println(num1+" "+num2);
	}
	else {
		System.out.print(num1+" "+num2+" ");
	for(int i=3;i<=n;i++) {
		int nextnum=num1+num2;
		num1=num2;
		num2=nextnum;
		System.out.print(nextnum+" ");
		
		
	}
	}
}
	
	
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		Fibonacciseries(n);
		
	}

}
