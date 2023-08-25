package wholeNumbers;

import java.util.Scanner;

public class SumofWholeNumbers {

	public static void main(String[] args) {
		System.out.println("i want the sum of first N whole numbers");
		//example if N=10 the the first 10 natural numbers are
		// the first ten numbers are 0,1,2,3,4,5,6,7,8,9
      System.out.println("enter the number");
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int sum=0;
	  for(int i=0;i<n;i++) {
		  sum=sum+i;
		  if(i!=n-1) {
			  System.out.print(i+"+");
			  
		  }
		  
	  }
	  System.out.print(n-1);
	  System.out.print("="+sum);
	}

}
