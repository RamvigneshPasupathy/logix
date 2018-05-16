package set_4;

/*

	To find the odd numbers in between the range.
	Input: 2 15
	Output: 3 5 7 9 11 13

 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOdd(2, 15);
	}
	
	static void printOdd(int start, int end) {
		if(start % 2 == 0) {
			start += 1;
		}
		for(int n=start; n<end; n+=2) {
			System.out.printf("%d ", n);
		}
	}

}
