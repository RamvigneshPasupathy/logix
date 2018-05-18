package set_32;

/*
	Given an array of numbers, find a number which has same sum of the numbers on its either side.
	Input: 1, 2, 3, 7, 6
	Output: 7 (has 1+2+3 in left, 6 in right)
 */

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 7, 6};
		printResults(arr);
	}
	
	static void printResults(int[] arr) {
		boolean noResultsFound = true;
		int len = arr.length;
		if(len == 1) {
			System.out.println(arr[0]);
		}
		for(int i=1; i<len-1; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for(int j=0; j<=i-1; j++) {
				sum1 += arr[j];
			}
			for(int j=i+1; j<len; j++) {
				sum2 += arr[j];
			}
			if(sum1 == sum2) {
				noResultsFound = false;
				System.out.println(arr[i]);
			}
		}
		if(noResultsFound) {
			System.out.println("-1");
		}
	}

}
