package set_2;

/*
	https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
 	Alternate sorting: Given an array of integers,
 	rearrange the array in such a way that the first element is first maximum and the second element is first minimum.
	
    Eg. Input  : {1, 2, 3, 4, 5, 6, 7}
        Output : {7, 1, 6, 2, 5, 3, 4} 
 */

public class _1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		alternateSort(arr);
		printArray(arr);

	}
	
	// input a sorted array of numbers
	static void alternateSort(int[] arr) {
		int len = arr.length;
		int[] temp = new int[len];
		

		for(int i=0; i<len; i++) {
			temp[i] = arr[i];
		}
		
		for(int i=0, j=0, k=len-1; i<len; i++) {
			if(i % 2 == 0) {
				arr[i] = temp[k];
				k--;
			} else {
				arr[i] = temp[j];
				j++;
			}
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
}
