package methodprogramspractice;

import java.util.Scanner;

public class Taxcalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  purchaseamount and taxrate ");
		double purchaseamount=scan.nextDouble();
		double taxrate=scan.nextDouble();
		double res1=calculateTotalWithTax(purchaseamount,taxrate);
		double totalcost=purchaseamount+res1;
	    System.out.println(totalcost);

	}
	public static double calculateTotalWithTax(double purchaseamount, double taxrate) {
		 double taxamount= purchaseamount * taxrate;
		 return taxamount;
	}

}
