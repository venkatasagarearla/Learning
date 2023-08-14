package doubleTrouble;
import java.util.Scanner;
public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);;
		System.out.println("enter the number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumbers(num));

	}

	public static  int doubleTheNumbers(int num) {
		return num*2;
	}
}
