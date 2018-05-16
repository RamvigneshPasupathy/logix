package apr_18;

import java.util.ArrayList;

/*
	Given a list of words and a string, tell if the string can be split into words based on the list.
	Eg: Input: {"sam", "in", "sung", "like", "i", "you", "water"}, "ilikesamsung"
		Output: "yes"
		
		Input: {"sam", "in", "sung", "like", "i", "you", "water"}, "idontlikesamsung"
		Output: "no"

 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"sam", "in", "sung", "like", "i", "you", "water"};
		String str1 = "ilikesamsung";
		String str2 = "idontlikesamsung";
		
		substringsMatch(words, str1);
		substringsMatch(words, str2);

	}
	
	static void substringsMatch(String[] words, String str) {
		ArrayList<Character> buffer = new ArrayList<Character>();
		for(int i=0; i<str.length(); i++) {
			buffer.add(str.charAt(i));
		}
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			int l = word.length();
			for(int j=0; j<=buffer.size()-l; j++) {
				boolean wordFound = true;
				for(int k=0; k<l; k++) {
					if(word.charAt(k) != buffer.get(j+k)) {
						wordFound = false;
						break;
					}
				}
				if(wordFound) {
					for(int k=0; k<l; k++) {
						buffer.remove(j);
					}
				}
			}
		}
		
		if(buffer.size() == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
