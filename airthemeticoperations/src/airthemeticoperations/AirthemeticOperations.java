package airthemeticoperations;

import java.util.Scanner;

public class AirthemeticOperations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumbers( num1,num2));
		System.out.println(multiplyNumbers( num1, num2));
		System.out.println(devideNumbers( num1,num2));
		System.out.println(findreminder( num1, num2));
	}

	
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}

public static int multiplyNumbers(int num1,int num2) {
	return num1*num2;
}



public static double devideNumbers(int num1,int num2) {
	return num1/num2;
	
}

public static int findreminder(int num1,int num2) {
	return num1%num2;
}

}

