package may_18;

/*
	Given a string, find the first character that recur and print the number of occurrences along that character.
	Input: "i have an apple"
	Output: a 3
 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i have an apple";
		int len = s.length();
		char c = ' ';
		int i=0, j=0, count = 0;
		
		for(; i<len; i++) {
			for(j=i+1; j<len-1; j++) {
				if(s.charAt(i) != ' ' && s.charAt(i) == s.charAt(j)) {
					c = s.charAt(i);
					i = len; j--;
					count = 1;
					break;
				}
			}
		}
		
		for(; j<len; j++) {
			if(c == s.charAt(j)) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.printf("%c %d", c, count);
		}

	}

}
