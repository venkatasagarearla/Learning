package numbers;

import java.util.Scanner;

public class SumofNumbersWithinrange {

	public static void main(String[] args) {
		System.out.println("Enter ranges");
		Scanner scan=new Scanner(System.in);
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    scan.close();
	   int sum=0;
	    for(int i=a;i<=b;i++) {
	    	sum=sum+i;
	    	if(i!=b) {
	    		System.out.print(i+"+");
	    	}
	    	
	    }
	    System.out.print(b);
	    System.out.print("="+sum);

	}

}
