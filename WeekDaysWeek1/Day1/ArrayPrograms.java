package w1Assignmets;

import java.util.Arrays;

import org.junit.Test;

public class ArrayPrograms {
	/*Implement below methods using array
        a. add to the specific index
        b. print the array value as string
        c. contains
        d. remove a value
        e. trim to the given length */
	//@Test
	public void addToSpecificInd () {
		int[] nums=new int[] {1,2,3,4};
		 int index = 1;
		 int insert = 5;
		 int [] out = addToSpecificIndex(nums, index, insert);
		 System.out.println("add Specific index :");
		 System.out.println(Arrays.toString(out));
	}
	
	@Test
	public void prtArrAsStr () {
		int[] nums=new int[] {1,2,3,4};
		String op = arAsStr(nums);
		System.out.println("As string :");
		System.out.println(op);
		
	}
	
	@Test
	public void contain () {
		int[] nums=new int[] {1,2,3,4};
		int target = 10;
		System.out.println("Contains :");
		contians(nums, target);	
	}
	
	@Test
	public void remAVal () {
		int[] nums=new int[] {1,2,3,4};
		int target = 3;
		System.out.println("Remove element :");
		removevalue(nums, target);	
	}
	
	@Test
	public void trim () {
		int[] nums=new int[] {1,2,3,4};
		int trm = 10;
		System.out.println("Trim :");
		trimlength(nums, trm);	
	}
	
	public int[] addToSpecificIndex(int [] nums, int idx , int insert) {
		int outp [] = new int[nums.length+1];
		int j=0;
		for(int i =0 ; i < nums.length ; i++) {	
			if(i == idx) {
				outp[j] = insert;
				j++;
				outp[j] = nums[i];
				j++;
			}
			else {
				outp[j]=nums[i];
				j++;
			}
		}
		return outp;
	}
	
	public String arAsStr(int [] nums) {
		int n = 0;
		for(int i =0; i< nums.length ; i++) {
			n = n * 10 + nums[i]; 
			} n = n + 1; 
			 String numString = Integer.toString(n);
			return numString;
		}
	
	public void contians (int [] nums, int tar) {
		 boolean b=false; 
			for(int i=0; i<nums.length; i++) {
				if(nums[i]==tar) {
				//System.out.println("Given value is present in an array");
					b=true;
				}
				}
			System.out.print(b);
			System.out.println();
		
	}
	private void removevalue(int[] nums, int rmv) {
		for(int i=0; i<nums.length; i++){
			if(nums[i]==rmv) {
				nums[i]=nums[i+1];
			}
			else {
				System.out.print(nums[i]+",");
			}
		}
		System.out.println();
	}
	private void trimlength(int[] nums, int trm) {
		int arr[]=new int[trm];
		for(int i=0; i<trm; i++) {
			arr[i]=nums[i];
		}
		System.out.println(Arrays.toString(arr));
	}

}
		
		

