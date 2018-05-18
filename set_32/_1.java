package set_32;

import java.util.ArrayList;

/*
	Print longest sequence between same character
	
	Input: abcccccbba
	Output: 8
	
	Input: aaaaaaaa
	Output: 6
 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLongestSequence("abcccccbba");
		printLongestSequence("aaaaaaaa");
		printLongestSequence("abcdef");
	}
	
	static void printLongestSequence(String s) {
		ArrayList<Character> charList = new ArrayList<Character>();
		int max = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!charList.contains(c)) {
				charList.add(c);
			}
		}
		for(Character c : charList) {
			int start = s.indexOf(c+"");
			int end = s.lastIndexOf(c+"");
			int distance = end - start - 1;
			max = max > distance ? max : distance;
		}
		
		System.out.println(max);
	}

}
