package w1Assignmets;

import org.junit.Test;

public class StartPyramid {
	
	/*use for outer for loop untill its <= given input integer
	 * create empty space before printing the started using for loop <= len-1
	 * print the star for based on i value print i no of starts 
	 *  */ 
	@Test
	public void posCase () {
		int starNum = 5;
		pyramid(starNum);		
	}	
	
	@Test
	public void EdgeCase () {
		int starNum = 0;
		pyramid(starNum);		
	}	
	
	@Test
	public void NegCase () {
		int starNum = -1;
		pyramid(starNum);		
	}
	public void pyramid(int in) {
		
	if(in == 0) {
		System.out.println("No of input rows are  0");
	}else if (in < 0) {
		System.out.println("No of input rows are negative value ");
	}
	else 
		for (int i = 1; i <= in; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= in - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
	}
  
} 
