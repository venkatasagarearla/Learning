package p1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		ArmstrongNumber A1=new ArmstrongNumber();
		int res=A1.countdigits(num);
		System.out.println(res);
		int ans=A1.number(num, res);
		if (ans == 1) {
            System.out.println("It's an Armstrong number.");
        } else {
            System.out.println("It's not an Armstrong number.");
        }
		

	}

}
