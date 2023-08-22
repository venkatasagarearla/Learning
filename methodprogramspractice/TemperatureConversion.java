package methodprogramspractice;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("welcome to temperature conversion tool");
		Scanner scan=new Scanner(System.in);
		

		System.out.println("Select an option:");
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert  Fahrenheit to Celsius ");
		System.out.println("Enter your choice:");
		int a=scan.nextInt();
		switch(a) {
		case 1:
			System.out.println("Enter the temperature in celsius:");
			double celsius =scan.nextDouble();
			System.out.println(celsius+"C"+"is equivalent to"+(TemperatureConversionApp.celsiusToFahrenheit(celsius))+"F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit =scan.nextDouble();
			System.out.println(fahrenheit+" "+"F"+" "+"is equivalent to"+(TemperatureConversionApp.fahrenheitToCelsius(fahrenheit))+"C");
			break;
		default:
			System.out.println("Conversion is not possible");
			
		}
		
		
		
	}

}
