package w1Assignmets;

import org.junit.Test;

	/*You are given a positive integer num consisting only of digits 6 and 9.
		Return the maximum number you can get by changing at most one digit 
		(6 becomes 9, and 9 becomes 6) 
		https://leetcode.com/problems/maximum-69-number/
		Pseudocode :
 		1. convert the given int vaulue to string
 		2. then string to char arr
 		3. then loop into the char array change if the value is 6 to 9 else 9 to 6
 		4. then convert the string back to int 
 		5. compare it with the input if its greater or not
 		6. then assing the grater value to a temp 
 		7. then when loop srun keep comparing with the max value and print the max number
	 */

public class Max69 {
	@Test
	public void poscase() {
		int num = 9669;
		max69(num);
	}
	
	@Test
	public void negcase() {
		int num = 9976;
		max69(num);
	}
	
	@Test
	public void edgecase() {
		int num = 9999;
		max69(num);
	}
	public void max69(int num) {
		int maxNum = num;
        //String.valueOf() -> converts different type of value into string
          for (int i = 0; i < String.valueOf(num).length(); i++) {
            char[] numArray = String.valueOf(num).toCharArray();
            if (numArray[i] == '6') {
                numArray[i] = '9';
            } else {
                numArray[i] = '6';
            }
   //It is used in Java for converting a string value to an integer by using the method parseInt().
			int newNum = Integer.parseInt(String.valueOf(numArray));
            if (newNum > maxNum) {
                maxNum = newNum;
            }
        }
        System.out.println("Maximum number after changing at most one digit: " + maxNum);
	}
}

