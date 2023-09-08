package p1;

public class ArmstrongNumber {
	int countdigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	int number(int num, int res) {
		
		int orginal = num;
		int arms = 0;
		
		while(num !=0) {
			int ld=num%10;
			int pow=1;
			for(int i=1;i<=res;i++) {
				pow=pow*ld;
			}
			arms=arms+pow;
			num=num/10;
			
		}
		if(arms==orginal) {
			return 1;
		}
		else {
			return 0;
		}
	
	}

}
