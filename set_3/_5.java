package set_3;

import java.util.ArrayList;

/*

	Given two sorted arrays, merge them such that the elements are not repeated
	
	Eg 1: Input:
	        Array 1: 2,4,5,6,7,9,10,13
	        Array 2: 2,3,4,5,6,7,8,9,11,15
	      Output:
	        Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
	        
 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
		int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
		
		Integer[] mergedArr = merge(arr1, arr2);
		printArray(mergedArr);
	}
	
	static Integer[] merge(int[] arr1, int[] arr2) {
		
		int size1 = arr1.length;
		int size2 = arr2.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i=0, j=0;		
		
		while(i<size1 && j<size2) {
			
			if(arr1[i] < arr2[j]) {
				result.add(arr1[i++]);
			} else if(arr1[i] > arr2[j]) {
				result.add(arr2[j++]);
			} else {
				result.add(arr1[i++]);
				j++;
			}
		}
		
		while(i<size1) {
			result.add(arr1[i++]);
		}
		
		while(j<size2) {
			result.add(arr2[j++]);
		}
		
		return result.toArray(new Integer[result.size()]);
		
		
	}
	
	static void printArray(Integer[] arr) {
		for(int i: arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}
