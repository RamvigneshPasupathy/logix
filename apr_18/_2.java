package apr_18;

import java.util.ArrayList;

/*
	Given an array of numbers, sort it in ascending order based on the frequency of occurrence.
	Eg. Input:  {2, 5, 2, 8, 5, 6, 8, 8}
		Output: {8, 8, 8, 2, 2, 5, 5, 6}
		
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> frequencies = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			int index = numbers.indexOf(num);
			if(index > -1) {
				int frequency = frequencies.get(index);
				frequencies.set(index, frequency+1);
			} else {
				numbers.add(num);
				frequencies.add(1);
			}
		}
		
		Integer[] nArr = new Integer[numbers.size()];
		Integer[] fArr = new Integer[frequencies.size()];
		
		nArr = numbers.toArray(nArr);
		fArr = frequencies.toArray(fArr);
		
//		mergeSort(arr, 0, arr.length - 1);
		for(int i=0; i<fArr.length; i++) {
			for(int j=0; j<fArr.length-1; j++) {
				if(fArr[j] < fArr[j+1]) {
					int temp = fArr[j];
					fArr[j] = fArr[j+1];
					fArr[j+1] = temp;
					temp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = temp;
				}
			}
		}
		
		for(int i=0, k=0; i<nArr.length; i++) {
			for(int j=0; j<fArr[i]; j++) {
				arr[k++] = nArr[i];
			}
		}
		
		printArray(arr);

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
			if(leftArr[i] >= rightArr[j]) {
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
