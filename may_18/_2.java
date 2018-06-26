package may_18;

import java.util.Arrays;

/*
	Given an array of numbers and a position p,
	Find the nearest square for the number at position p.
	Place the square value in the first index of the array and sort the rest of the numbers in ascending order.
	
	Input: {45, 23, 67, 11, 29, 40}, 1
	Output: {25, 11, 29, 40, 45, 67}
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {45, 23, 67, 11, 29, 40};
		int i = 1;
		
		int[] temp = new int[arr.length - 1];
		for(int j=0, k=0; j<arr.length; j++) {
			if(j != i) {
				temp[k++] = arr[j];
			}
		}
		
		Arrays.sort(temp);
		
		arr[0] = getNearestSquare(arr[i]);
		
		for(i=0; i<temp.length; i++) {
			arr[i+1] = temp[i];
		}
		
		printArray(arr);
		
		
	}
	
	static int getNearestSquare(int n) {
		int sqrt = (int) Math.round(Math.sqrt(n));
		return sqrt * sqrt;
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
