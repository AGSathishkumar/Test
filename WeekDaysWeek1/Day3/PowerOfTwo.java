package w1Assignmets;

import org.junit.Test;

/*
 * first divide the given number by 2 then 
 * use for loop and run the loop untill i < divide half value
 *  inside the loop assign a temp =2 and multiply with 2 and store in a variable
 *  then comaprare the multilied value == input then print true
 *  else false 
 */

public class PowerOfTwo {
	//@Test
	public void posCase() {
		int num = 64;
		boolean o = pwrOfTwo(num);
		System.out.println(o);
	}
	
	@Test
	public void negCase() {
		int num = 9;
		boolean o = pwrOfTwo(num);
		System.out.println(o);
	}
	
	//@Test
	public void edgeCase() {
		int num = -1;
		pwrOfTwo(num);
	}
	
	public boolean pwrOfTwo(int num) {
		
		
		
		int midValue = num / 2;
		int temp = 2;
		int mulValue = 0;
		int odd = 0;
		boolean flag = false;
		if (num == 1) {
			System.out.println("True");
		} else if (num < 0) {
			System.out.println("Given input is negative");
		} else
			for (int i = 0; i < midValue; i++) {
				mulValue = temp * 2;
				temp = mulValue;
				if (mulValue == num) {
//					System.out.println("True");					
					odd = mulValue % 2;
					if(odd != 0) {
						flag = false;
					}
					flag = true;
					break;
				} 
//				else if (i == 0 && flag == false )
//					System.out.println("False");
			}
		return flag;
		 
		
		/*Simple logic :
		 * if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
		 */
		
	} 

}
	

