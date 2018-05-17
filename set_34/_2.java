package set_34;

/*
	Find the next greater element for each element in given array.
	Input: array[] = {6, 3, 9, 10, 8, 2, 1, 15, 7}
	Output: {7, 6, 10, 15, 9, 3, 2, _, 8}
	If we are solving this question using sorting, we need to use any O(nlogn) sorting algorithm.
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 3, 9, 10, 8, 2, 1, 15, 7};
		int[] sorted = arr.clone();
		mergeSort(sorted, 0, sorted.length - 1);
		String[] result = nextGreats(arr, sorted);
		printArray(result);
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
		
		for(int i=0; i<rightSize; i++) {
			rightArr[i] = arr[center + 1 + i];
		}
		
		int i=0, j=0, k=left;
		
		while(i<leftSize && j<rightSize) {
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
	
	static String[] nextGreats(int[] arr, int[] sorted) {
		String[] result = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int index = getIndex(sorted, arr[i]);
			if(index < arr.length-1) {
				result[i] = sorted[index + 1] + "";
			} else {
				result[i] = "_";
			}
		}
		return result;
	}
	
	static int getIndex(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	static void printArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.println();
	}

}
