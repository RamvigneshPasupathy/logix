package set_33;

/*

	Given a sentence, remove the palindrome words and print the remaining.
	Input: He did a good deed
	Output: He good
	
 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "He did a good deed";
		removePalindromes(sentence);
	}
	
	static void removePalindromes(String s) {
		String[] words = s.split(" ");
		for(int i=0; i<words.length; i++) {
			if(!isPalindrome(words[i])) {
				System.out.printf("%s ", words[i]);
			}
		}
	}
	
	static boolean isPalindrome(String s) {
		int len = s.length();
		for(int i=0; i<len/2; i++) {
			if(s.charAt(i) == s.charAt(len - i - 1)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
