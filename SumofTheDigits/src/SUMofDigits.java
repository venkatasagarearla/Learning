import java.util.Scanner;

public class SUMofDigits {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int sum=0;
		while(a!=0) {
		int c=a%10;
		sum=sum+c;
		a=a/10;
		}
		System.out.println(sum);

		
		

	}

}
