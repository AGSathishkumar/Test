package w1Assignmets;

import org.junit.Test;

public class RightAnglePascalTriangePatrn {
	@Test
	public void posCase () {
		int rows = 5;
		pascalTri(rows);
	}
	
	@Test
	public void negCase () {
		int rows = -2;
		pascalTri(rows);
	}
	
	@Test
	public void edgeCase () {
		int rows = 0;
		pascalTri(rows);
	}
	
	public void pascalTri (int in) {
		if(in == 0) {
			System.out.println("No of input rows are  0");
		}else if (in < 0) {
			System.out.println("No of input rows are negative value ");
		}
		else 
			for (int i = 1; i <= in; i++) {

	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            // Move to the next line
	            System.out.println();
	        }
		
		for (int i = in; i >= 0; i--) {
            // Print spaces before the stars
         

            // Print stars
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
	
	}

}
