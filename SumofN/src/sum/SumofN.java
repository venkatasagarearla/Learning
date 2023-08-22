package sum;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		System.out.println("enetr number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSum(n);
		

	}
public static void calculateSum(int n) {
	int a=(n*(n+1))/2;
	System.out.println(a);
	
}
}
