package journeycalculator;
import java.util.Scanner;
public class JourneyCalculatorApp {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter speed and time");
			double t=scan.nextDouble();
			double s=scan.nextDouble();
			JourneyCalculator journeyCalculator=new JourneyCalculator();
			double res=journeyCalculator.calculateDistance(t,s);
			System.out.println(res);
		    scan.close();

		}

	}

