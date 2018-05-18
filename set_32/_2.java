package set_32;

/*
	Sort the array odd numbers in ascending and even numbers in descending.	
	Input: 5 8 11 6 2 1 7
	Output: 1 5 7 11 8 6 2
	
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 8, 11, 6, 2, 1, 7};
		printSorted(numbers);
	}
	
	static void printSorted(int[] arr) {
		int len = arr.length;
		int[] temp = new int[len];
		mergeSort(arr, 0, len - 1);
		for(int i=0, j=len-1, k=0; k<len; k++) {
			if(arr[k] % 2 != 0) {
				temp[i++] = arr[k];
			} else {
				temp[j--] = arr[k];
			}
		}
		printArray(temp);
	}
	
	static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2; 
			mergeSort(arr, left, center);
			mergeSort(arr, center + 1, right);
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
		
		for(int i=0; i<rightSize; i++) {
			rightArr[i] = arr[center + 1 + i];
		}
		
		int i=0, j=0, k=left;
		while(i<leftSize && j<rightSize) {
			if(leftArr[i]<rightArr[j]) {
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
