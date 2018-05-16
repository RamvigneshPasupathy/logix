package set_4;

/*
	To find the factors of the numbers given in an array,
	and to sort the numbers in descending order according to the factors present in it.
	Input: 8 2 3 12 16
	Output: 12 16 8 2 3
	
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {8, 2, 3, 12, 16};
		int[] factors = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=1; j<=numbers[i]; j++) {
				if(numbers[i] % j == 0) {
					factors[i] += 1;
				}
			}
		}
		
		for(int i=0; i<factors.length; i++) {
			for(int j=0; j<factors.length-1; j++) {
				if(factors[j] < factors[j+1]) {
					int temp = factors[j];
					factors[j] = factors[j+1];
					factors[j+1] = temp;
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		printArray(numbers);
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

}
