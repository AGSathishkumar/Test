package w1Assignmets;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne {
/* 1. given input digits = [1,2,3] and output [1,2,4]
2. convert the int array into integer using inbuilt function 
3. increment the integer by 1
4. convert the incremented interger into array
5. now compare the input and output arry to confirm the last value is incremented by 1
OR
1. if last digit is 9 then make that as 0 and increase the over all arr length by 1
2. then make the previous index +1
3. else make the index <9 as +1*/
	@Test
	public void posEx() {
		int [] digits = {1,2,3};
		int[] out = plusOne(digits);
		System.out.println(Arrays.toString(out));
	}

	@Test
	public void NegEx() {
		int [] digits = {-1};
		int[] out = plusOne(digits);
		System.out.println(Arrays.toString(out));
	}
	
	@Test
	public void EdgeCase() {
		int [] digits = {9,9,9};
		int[] out = plusOne(digits);
		System.out.println(Arrays.toString(out));
	}

	public int []  plusOne(int[] dig) {
		for(int i= dig.length-1; i >= 0 ; i--) {
			if(dig[i] < 9) {
				dig[i] = dig[i]+1;
				return dig;
			} else 
				dig[i] = 0;
			if(i == 0) {
				dig = new int[dig.length + 1];
				dig[0] = 1;}
		}
		return dig;
	}
		/*
		 * int num = 0; int k; int[] result = new int[dig.length]; int i = 0;
		 * 
		 * for (; i < dig.length; i++) {
		 * 
		 * num = num * 10 + dig[i]; } num = num + 1; 
		 * String numString = Integer.toString(num); // Convert int to String result = new
		 * int[numString.length()]; // Create an int array to store the digits
		 * 
		 * for ( k = 0; k < numString.length(); k++) { result[k] =
		 * Character.getNumericValue(numString.charAt(k)); // Convert char to int }
		 * System.out.println();
		 * 
		 * return result;
		 */
		 
	}
