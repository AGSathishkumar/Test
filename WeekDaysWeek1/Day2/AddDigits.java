package w1Assignmets;

import org.junit.Test;

public class AddDigits {
	/*divide the inout and take the each number and add it in a temp
	 * then if (added value is >= 9 then assigne the vlaue to divide again and add those 
	 * values there by also reset the temp by 0
	 * do this untill the temp <= 9 */
	@Test
	public void posCase () {
		int num = 18278;
		addDig(num);
	}
	
	//@Test
	public void negCase () {
		int num = -855;
		addDig(num);
	}
	
	//@Test
	public void edgeCase () {
		int num = 4 ;
		addDig(num);
	}
	
	public void addDig(int num) {
		int reminder = 0 ;
		int divisor = 0;
		int sum = 0;
		if(num > 9) {
			do {
			reminder = num % 10; 
//			System.out.println("reminder % 10 :" +reminder);
			sum +=reminder;
			divisor = num /10;
//			System.out.println("divisor / 10 :" +divisor);
			num = divisor;
			
			}while (divisor != 0 );
			
			if(sum > 9) {
				num = sum;
				sum = 0;	
				
				do {
					reminder = num % 10; 
					
					sum +=reminder;
					divisor = num /10;
					num = divisor;
					
					}while (divisor != 0 );
			}
			System.out.println(sum);			
		} else System.out.println(num);
		
	}
}
