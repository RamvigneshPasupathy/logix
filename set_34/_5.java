package set_34;

import java.util.ArrayList;

/*
	Given an array with repeated numbers, find the top three repeated numbers.
	Input: {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
	Output: 3, 16, 15 

 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		printTopThreeNumbers(arr);
	}
	
	static void printTopThreeNumbers(int[] arr) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<Integer> frequencyList = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int number = arr[i];
			int index = numberList.indexOf(number); 
			if(index > -1) {
				int count = frequencyList.get(index);
				frequencyList.set(index, count+1);
			} else {
				numberList.add(number);
				frequencyList.add(1);
			}
		}
		
		Integer[] nArr = new Integer[numberList.size()];
		Integer[] fArr = new Integer[frequencyList.size()];
		
		nArr = numberList.toArray(nArr);
		fArr = frequencyList.toArray(fArr);
		
		for(int i=0; i<nArr.length; i++) {
			for(int j=0; j<nArr.length-1; j++) {
				if(fArr[j] < fArr[j+1]) {
					int temp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = temp;
					temp = fArr[j];
					fArr[j] = fArr[j+1];
					fArr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.printf("%d ", nArr[i]);
		}
		
	}

}
