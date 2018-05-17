package set_34;

/*
	Given a number, find the next smallest palindrome.
	
 */

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 9};
		int[] b = {1, 2, 2, 1};
		int[] c = {2, 3, 5, 4, 5};
		
		printNextSmallestPalindrome(a);
		printNextSmallestPalindrome(b);
		printNextSmallestPalindrome(c);
	}
	
	static void printNextSmallestPalindrome(int[] n) {
		int len = n.length;
		int center = len / 2; 
		int i = center - 1; // to traverse from center to left
		int j = odd(len) ? center+1 : center; // to traverse from center to right
		
		if(nines(n)) {
			System.out.print(1);
			for(int k=1; k<len; k++) {
				System.out.print(0);
			}
			System.out.print(1);
		} else {
			// escape out the matching items
			while(i>=0 && n[i] == n[j]) {
				i--;
				j++;
			}
			
			
			// check if the boundary has crossed - this will happen if the n itself is palindrome
			boolean crossedBoundary = i<0;
			
			// check if left item is smaller than the right item
			boolean smallerLeft = false;
			if(!crossedBoundary && n[i]<n[j]) {
				smallerLeft = true;
			}
			
			// mirror left items to the right
			while(i>=0) {
				n[j++] = n[i--];
			}
			
			// if left is smaller or the boundary has been crossed
			if(smallerLeft || crossedBoundary) {
				int carry = 1;
				i = center - 1;
				j = odd(len) ? center+1 : center;
				
				// don't forget the center item; add carry
				if(odd(len)) {
					n[center] += carry;
					carry = n[center] / 10;
					n[center] %= 10; 
				}
				
				while(i>=0) {
					n[i] += 1;
					carry = n[i] / 10;
					n[i] %= 10;
					n[j++] = n[i--]; // copy the modified left number to right
				}
			}
			
			printArray(n);
		
		}
		
	}
	
	static boolean nines(int[] n) {
		for(int i=0; i<n.length; i++) {
			if(n[i] != 9) {
				return false;
			}
		}
		return true;
	}
	
	static boolean odd(int n) {
		return n % 2 != 0; 
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
