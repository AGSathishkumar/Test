package w1Assignmets;

import java.util.Arrays;

import org.junit.Test;

public class RmvAllOccByIndex {
	/*
	 * Remove all occurrence of a number which is present in the given index number
	 * input = {1,2,3,4,5,1}, indexToRemove = 5 output = {2,3,4,5}
	 * 
	 */

	//@Test
	public void posCase() {
		int arr[] = { 1,2, 3, 4, 5, 6 };
		int rmvIndex = 5;
		int result[] = rmvAllTrgIndexVal(arr, rmvIndex);
		System.out.println("Pos case :");
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void negCase() {
		int arr[] = { 1,2, 3, 4, 5, 6 };
		int rmvIndex = 7;
		int result[] = rmvAllTrgIndexVal(arr, rmvIndex);
		System.out.println("Neg case :");
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void edgeCase() {
		int arr[] = { 1,2, 3, 4, 5, 6 };
		int rmvIndex = 3;
		int result[] = rmvAllTrgIndexVal(arr, rmvIndex);
		System.out.println("Edge case :");
		System.out.println(Arrays.toString(result));
	}

	public int[] rmvAllTrgIndexVal(int[] arr, int indx) {
		if(indx > arr.length) 
			System.out.println("The given index is not found"); 
	
		int indxVal = arr[indx];
		int noOfOcc = 0;
		for (int temp : arr) {
			if (temp == indxVal)
				noOfOcc++;
		}
		int out[] = new int[arr.length - noOfOcc];
		int index = 0;
		if (noOfOcc == 0) {
			return arr;
		}
		for (int temp1 : arr) {
			if (temp1 != indxVal) {
				out[index++] = temp1;
			}
		}
		return out;
	}
}