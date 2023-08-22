package methodprogramspractice;

import java.util.Scanner;

public class Tenchecker {
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("the number is multiple of 10");
			
		}
		else {
			System.out.println("no");
		}

		
	}
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	scan.close();
	checkMultipleOfTen(n);
	
}

}
