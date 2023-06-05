package w1Assignmets;

import java.util.Arrays;

import org.junit.Test;

public class RemoveTheOccurance {
	/*
	 * Remove the first and last occurrence of a given number in the input array
	 * input = {1,2,3,4,5,1}, target = 1 output = {2,3,5}
	 * 
	 * Pseudocode : use the for loop iteration compare the each element is equal to
	 * the target if not equals store that in a new array
	 */
	@Test
	public void posCase() {
		int arr[] = { 1, 2, 3, 4, 5, 1 };
		int rmvTarget = 1;
		int result[] = rmvTheTrg(arr, rmvTarget);
		System.out.println("Pos case :");
		System.out.println(Arrays.toString(result));
	}

	 @Test
	public void negCase() {
		int arr[] = { 2, 3, 4, 5 };
		int rmvTarget = 1;
		int result[] = rmvTheTrg(arr, rmvTarget);
		System.out.println("Neg case :");
		System.out.println(Arrays.toString(result));
	}

	 @Test
	public void edgeCase() {
		int arr[] = { 1, 2, 3, 1, 4, 5, 1, 2 };
		int rmvTarget = 1;
		int result[] = rmvTheTrg(arr, rmvTarget);
		System.out.println("edge case :");
		System.out.println(Arrays.toString(result));
	}

	public int[] rmvTheTrg(int[] arr, int tar) {
		
		int noOfOcc = 0;
		for (int temp : arr) {
			if (temp == tar)
				noOfOcc++;
		}
		int out[] = new int[arr.length - noOfOcc];
		int index=0;
		if(noOfOcc == 0) return arr;
		for(int temp1 : arr) {
			if(temp1 != tar) {
				out[index++] = temp1;
			}
		}
		return out;
	}

	/*
	 * public int[] rmvTheTrg (int [] arr , int tar) {
	 * 
	 * int count = 0; int out[] = new int[arr.length]; for (int i = 0; i<=
	 * arr.length-1 ; i++) { if(arr[i] != tar) { if(count == i) { out[i] = arr[i];
	 * 
	 * }else if(count > 0) { out[i-1] = arr[i];
	 * 
	 * } }count ++;
	 * 
	 * } return out; }
	 */
}
