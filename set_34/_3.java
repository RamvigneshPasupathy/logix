package set_34;

import java.util.ArrayList;

/*

	Print all distinct permutations of a given string with duplicate characters.

 */

public class _3 {

	static ArrayList<String> permutations = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCA";
		printPermutations(str, 0, str.length() - 1);
		for(String s: permutations) {
			System.out.println(s);
		}
	}
	
	static void printPermutations(String s, int left, int right) {
		if(left == right) {
			if(permutations.indexOf(s) == -1) {
				permutations.add(s);	
			}
		} else {
			for(int i=left; i<=right; i++) {
				s = swap(s, left, i);
				printPermutations(s, left+1, right);
				s = swap(s, left, i);
			}
		}
	}
	
	static String swap(String s, int i, int j) {
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		String result = "";
		for(int k=0; k<c.length; k++) {
			result += c[k];
		}
		return result;
	}

}
