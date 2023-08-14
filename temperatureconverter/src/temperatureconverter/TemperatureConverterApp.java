package temperatureconverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the tempereture ");
		Double F=scan.nextDouble();
		TemperatureConverter temperatureConvert=new TemperatureConverter();
		double res=temperatureConvert.convertFahrenheitToCelsius(F);
		System.out.println(res);
		scan.close();
	}

}
