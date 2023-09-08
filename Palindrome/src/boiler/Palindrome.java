package boiler;

public class Palindrome {
	boolean checkPalindrome(int a) {
		int original=a;
		int rev=0;
		while(a>0) {
			int ld=a%10;
			rev=rev*10+ld;
			a=a/10;
		}
		if (original==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
