package w1Assignmets;

import org.junit.Test;

public class FullDiamond {
	/*for upper diamond :
	 * First create no of space based on the input number
	 * then at last print the star
	 * 
	 *  for lower diamond:
	 *  print the no of start based on the input number
	 *  then leave space accoridnt he number */
	@Test
	public void posCase () {
		int  d = 5;	
		fullDiamond(d);
	}
	public void fullDiamond (int rows) {
		/*
		 * int i = 1; for (; i <= n; i++) {		 * 
		 * for (int j = 1; j <= n - i; j++) { System.out.print(" "); }		 * 
		 * // Print stars for (int k = 1; k <= i; k++) { System.out.print("* "); }	 * 
		 * System.out.println(); }		 */
		/*
		 * int j = n; for (; j <= n; j++) {
		 * 
		 * for (int k = 1; k <= j; k++) { System.out.print("* "); }
		 * System.out.println(); for (int l=1 ; l <= n-1 ; l++) { for (int o = 1; o <= n
		 * - i; o++) { System.out.print(" "); } break; } int k = 1; for (; k <= n; k++)
		 * { System.out.print(" "); } for(int p=1; p<=n ; p++) {
		 * System.out.println("* "); }
		 * 
		 * 
		 * System.out.println(); }
		 * 
		 * while(currentRow <= rows){
            int prefixSpace = rows-currentRow;
            int stars=(currentRow*2)-1;
            while (stars++ <= rows)
                System.out.print("*");
            System.out.println();
            while(prefixSpace++ < rows)
                System.out.print(" ");
            currentRow++;           
        }
		 */
		
		/*
		 * int currentRow = 1; while(currentRow <= rows){ int prefixSpace =
		 * rows-currentRow; while(prefixSpace-- > 0) System.out.print(" ");
		 * 
		 * int stars=(currentRow*2)-1; while (stars-- > 0) System.out.print("*");
		 * currentRow++; System.out.println(); } int currentRowB = 5; while(currentRowB
		 * >= 0){ int star = (currentRowB * 2) -1; while(star-- >0) {
		 * System.out.print("*"); currentRowB--; } }
		 * 
		 * currentRowB = 1; int space = currentRowB ; while(space-- >0) {
		 * System.out.println("s"); }
		 */

		
		      
		        System.out.print("Enter the number of rows: ");
		        

		        int spaces = rows - 1;
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= spaces; j++) {
		                System.out.print(" ");
		            }
		            spaces--;

		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        spaces = 1;
		        for (int i = 1; i <= rows - 1; i++) {
		            for (int j = 1; j <= spaces; j++) {
		                System.out.print(" ");
		            }
		            spaces++;

		            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		    }
		}