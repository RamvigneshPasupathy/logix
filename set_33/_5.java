package set_33;

/*
 	Let 1 represent A, 2 represent B, etc.
 	Given a digit sequence, count the number of possible decodings of the given digit sequence.
 	Input: 121
 	Output: 3
 	The possible decodings are ABA, AU, LA 
 	Note: An empty digit sequence is considered to have one decoding
 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1, 2, 1};
		System.out.println(decodings(digits, digits.length));
	}
	
	static int decodings(int[] digits, int n) {
		int count = 0;
		if(n == 0 || n == 1) {
			return 1;
		}
		
		if(digits[n-1] > 0) {
			count = decodings(digits, n-1);	
		}
		
		if(digits[n-2] == 1 || digits[n-2] == 2 && digits[n-1] < 7) {
			count += decodings(digits, n-2);
		}
		return count;
	}

}
