package vendingmachine;

import java.util.Scanner;

public class VendingMachine {
	public static void getProduct(String productCode)

	{
		switch(productCode) {
		case"p01":System.out.println("Cocacola");
		             break;
		case"p02":System.out.println("Fanta");
		            break;
		case"po3":System.out.println("jaljeera");
		            break;
		case"p04":System.out.println("mountain dew");
		            break;
		case"p05":System.out.println("BoatGuava");
		            break;
		default:
			System.out.println("Panaka");
		
		}

	

	}

	public static void main(String[] args)

	{
     System.out.println("enter the product code");
     Scanner scan=new Scanner(System.in);
     String productCode=scan.next();
     scan.close();
     getProduct(productCode);
	

	}

}
