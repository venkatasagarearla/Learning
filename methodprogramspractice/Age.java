package methodprogramspractice;

import java.util.Scanner;

public class Age {

	public static  void categorizeAge(int n) {
		
		
		if (n>0 && n<=12) {
			System.out.println("child");
		}
		
		else if(n>=13 && n<=19) {
			System.out.println("teen");
		}
		else if(n>=20 && n<=59) {
			System.out.println("adult");
			
			
		}
		else {
			System.out.println("senior");
		}

	}
	public static void main(String[] args) {
		System.out.println("enetr age");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		categorizeAge(n);
	}

}
