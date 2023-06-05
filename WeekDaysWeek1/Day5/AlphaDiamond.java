package w1Assignmets;

import org.junit.Test;

public class AlphaDiamond {
	@Test
	public void posCase() {
		char input = 'F';
		alphaDiamond(input);
	}

	@Test
	public void negCase() {
		char input = '3';
		alphaDiamond(input);
	}

	@Test
	public void edgeCase() {
		char input = '*';
		alphaDiamond(input);
	}

	public void alphaDiamond(char inputChar) {
		int charToInt = (int) inputChar;
		int spaces = charToInt - 65;
		if (charToInt < 65) {
			System.out.println("The given input is not an alpha");
		}
		//upper part
		for (int i = 0; i <= spaces; i++) {
			// sapce before A
			for (int j = spaces; j > i; j--) {
				System.out.print(" ");
			}// Prints A at the center
			for (int j = i; j <= i; j++) {
				System.out.print((char) (65 + j) + " ");
				// 
				if (i > 0) 
				{
					for (int m = 0; m < j + i; m++) {
					System.out.print(" "); }
					System.out.print((char) (65 + j) + " ");
				}
			}
			System.out.println();
		}
		for (int i = spaces - 1; i >= 0; i--) {
			for (int j = spaces; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= i; j++) {
				System.out.print((char) (65 + j) + " ");
				if (i != 0) 
				{
					for (int m = 0; m < j + i; m++) {
					System.out.print(" "); }
					System.out.print((char) (65 + j) + " ");
				}
			}
			System.out.println();
		}
	}
}
