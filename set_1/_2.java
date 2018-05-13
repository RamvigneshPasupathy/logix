package set_1;

/*
 *  https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
	Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
	    1. 5 if a perfect square
	    2. 4 if multiple of 4 and divisible by 6
	    3. 3 if even number
	
	And sort the numbers based on the weight and print it as follows
	
	<10,its_weight>,<36,its weight><89,its weight>
	
	Should display the numbers based on increasing order.
 */

public class _2 {
	
	static int[] arr = {10, 36, 54, 89, 12};
	static int[] weights = {0, 0, 0, 0, 0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			weights[i] = 0;
			
			if(isPerfectSquare(num)) {
				weights[i] += 5; 
			}
			if(isMultipleOf4andDivisibleBy6(num)) {
				weights[i] += 4;
			}
			if(isEven(num)) {
				weights[i] += 3;
			}
		}
		
		sortByWeights(arr, weights);
		printResult();

	}
	
	static boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		int sqr = sqrt * sqrt;
		if(num == sqr) {
			return true;
		}
		return false;
	}
	
	static boolean isMultipleOf4andDivisibleBy6(int num) {
		if(num % 4 == 0 && num % 6 == 0) {
			return true;
		}
		return false;
	}
	
	static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	static void sortByWeights(int[] arr, int[] weights) {
		int len = arr.length;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len-1; j++) {
				if(weights[j] < weights[j+1]) {
					int temp = weights[j]; 
					weights[j] = weights[j+1];
					weights[j+1] = temp;
					temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printResult() {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("<%d, %d>, ", arr[i], weights[i]);	
		}
	}
	
	static double squareRoot(double num) {
		return 0;
	}
}
