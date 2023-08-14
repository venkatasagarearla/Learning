package carApp;

import java.util.Scanner; 
//Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”.

//Call the getBrand() method in the main method of the Sample class  and store the value of the brand in a variable, and print the value
public class CarApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the brand of car");
    String str1=scan.next();
	Car car=new Car();
	System.out.println( "the brand of car is" +car.Brand(str1));

	}

}
