package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
	public static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
	}
		
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printTable(n);
		
		
	}

}

