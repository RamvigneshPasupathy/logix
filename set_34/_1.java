package set_34;

/*
	Given two strings s1 and s2, remove all the characters from s1 which are present in s2.
	Input:
		s1="expErIence", s2="En"
	Output:
		s2="exprIece"
	
 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "expErIence";
		String s2 = "En";
		s1 = removeChars(s1, s2);
		System.out.println(s1);
	}
	
	static String removeChars(String str1, String str2) {
		String result = "";
		for(int i=0; i<str1.length(); i++) {
			boolean charFound = false;
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					charFound = true;
					break;
				}
			}
			if(!charFound) {
				result += str1.charAt(i);
			}
		}
		return result;
	}

}
