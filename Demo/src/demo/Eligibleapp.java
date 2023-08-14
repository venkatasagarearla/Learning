package demo;

import java.util.Scanner;

public class Eligibleapp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter marks");
    int marks=scan.nextInt();
    System.out.println("Welcome to kodeNest");
    //Eligible eligible=new Eligible();
    Eligible.allow(marks);

	

}
}

