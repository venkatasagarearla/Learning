package charcterIdentifier;

import java.util.Scanner;

public class CharcterIdentifier {
	public static void identifyCharacter(char ch) {
		if(Character.isLowerCase(ch)) {
			if(ch=='a' ||ch== 'e' || ch=='i'||ch=='o' ||ch=='u') {
				System.out.println("lower case vowel");
			}
			else {
				System.out.println("lower case consonant");
			}
		}
		
		else if(Character.isUpperCase(ch)) {
			if(ch=='A' ||ch== 'E' || ch=='I'||ch=='O' ||ch=='U') {
				System.out.println("Upper case vowel");
			}
			else {
				System.out.println("uppercase consonant");
			
			
		}
				
			}
		else if(Character.isDigit(ch)) {
			System.out.println("it is a digit");
			
			
			
		
		}
		else {
			System.out.println("special character");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		scan.close();
		identifyCharacter('a');
	}

}
