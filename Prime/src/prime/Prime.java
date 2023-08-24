package prime;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("enter a  number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		printprime(n);
	}
		public static void printprime(int n) {
			int count=0;
			for(int i=2;count<n;i++) {
				boolean res=checkprime(i);
				if(res==true) {
				System.out.println(i+" ");
				count++;
			}
		}
		}

		public static boolean checkprime(int n) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
			
			}
			
		}
			
	




