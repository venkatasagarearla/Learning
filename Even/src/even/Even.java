package even;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.println("enetr a number");
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    printEvenNumber(n);
}
public static void printEvenNumber(int n)

{
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
			i++;
		}
	}
	}
}
