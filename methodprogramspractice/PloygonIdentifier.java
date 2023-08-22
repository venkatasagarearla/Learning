package methodprogramspractice;

import java.util.Scanner;

public class PloygonIdentifier {
	
	public static void identifyPolygon(int sides) {
		switch(sides)
		{
		case 3:
			System.out.println("traingle");
		      break;
		case 4:
		
			System.out.println("quadilateral");
			break;
			
		case 5:
			System.out.println("pentogon");
			break;
		case 6:
			System.out.println("hexagon");
			break;
		default:
			System.out.println("ploygon");
			
}
	}
	
		public static void main(String[] args) {
			System.out.println("enter the number of sides");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			identifyPolygon(n);
			
		}

}
