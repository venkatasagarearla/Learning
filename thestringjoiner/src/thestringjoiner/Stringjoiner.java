package thestringjoiner;

import java.util.Scanner;
public class Stringjoiner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two strings");
		String str1=scan.next();
		String str2=scan.next();
		System.out.println(joinsString(str1,str2));
		scan.close();

	}
     public static String joinsString(String str1,String str2)
     {
	     return str1+str2;
     }
}
