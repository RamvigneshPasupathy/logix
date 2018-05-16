package apr_18;

import java.util.Stack;

/*

	Given two strings, sort the first string according to the sequence of the second string.
	Eg. Input:
			String1: ballon
			String2: one
		Output: onballo
			
 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ballon";
		String str2 = "one";
		String sortedStr = _sortedString(str1, str2);
		System.out.println(sortedStr);

	}
	
	static String sortedString(String str1, String str2) {
		Stack<Character> traversalStack = new Stack<Character>(); 
		String str = "";
		for(int i=0; i<str2.length(); i++) {
			for(int j=0; j<str1.length(); j++) {
				if(str1.charAt(j) == str2.charAt(i) &&
					!traversalStack.contains(str1.charAt(j))) {
					str += str1.charAt(j);
				}
			}
			traversalStack.push(str2.charAt(i));
		}
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(!traversalStack.contains(c)) {
				str += c;
			}
		}
		
		return str;
	}
	
	static String _sortedString(String str1, String str2) {
		String str = ""; 
		int[] frequency = new int[26];
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			frequency[c - 'a']++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			char c = str2.charAt(i);
			for(int j=0; j<frequency[c - 'a']; j++) {
				str += c;
			}
			frequency[c - 'a'] = 0;
		}
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(frequency[c - 'a'] != 0) {
				str += c;
			}
		}
		
		return str;
	}

}
