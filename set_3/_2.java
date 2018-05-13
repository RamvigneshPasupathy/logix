package set_3;

/*
 	https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
 	Write a program to sort the elements in odd positions in descending order and elements in ascending order

	Eg 1: Input: 13,2,4,15,12,10,5
	      Output: 13,2,12,10,5,15,4
	Eg 2: Input: 1,2,3,4,5,6,7,8,9
	      Output: 9,2,7,4,5,6,3,8,1 
 
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {13, 2, 4, 15, 12, 10, 5};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		mergeSort(arr1, 0, arr1.length - 1);
		arr1 = alternateSort(arr1);
		printArray(arr1);
		
		mergeSort(arr2, 0, arr2.length - 1);
		arr2 = alternateSort(arr2);
		printArray(arr2);

	}
	
	
	static int[] alternateSort(int[] arr) {
		int len = arr.length;
		int[] result = new int[len];
		for(int k=0, i=0, j=len-1; i<j;) {
			result[k++] = arr[i++];
			result[k++] = arr[j--];
		}
		if(len%2 != 0) {
			result[len-1] = arr[len/2];
		}
		
		return result;
	}
	
	static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2; 
			mergeSort(arr, left, center);
			mergeSort(arr, center+1, right);
			merge(arr, left, center, right);
		}
	}
	
	static void merge(int[] arr, int left, int center, int right) {
		int leftSize = center - left + 1;
		int rightSize = right - center;
		int[] leftArr = new int[leftSize];
		int[] rightArr = new int[rightSize];
				
		for(int i=0; i<leftSize; i++) {
			leftArr[i] = arr[left + i];
		}
		
		for(int j=0; j<rightSize; j++) {
			rightArr[j] = arr[center + 1 + j];
		}
			
		int i=0, j=0, k=left;
		
		while(i < leftSize && j < rightSize) {
			if(leftArr[i] < rightArr[j]) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
			}
		}
			
		while(i<leftSize) {
			arr[k++] = leftArr[i++];
		}
		
		while(j<rightSize) {
			arr[k++] = rightArr[j++];
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

}
