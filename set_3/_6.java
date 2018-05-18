package set_3;

/*

 Using Recursion reverse the string such as

	Eg 1: Input: one two three
	      Output: three two one
	Eg 2: Input: I love india
	      Output: india love I 

 */

public class _6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "one two three";
		String str2 = "I love india";
		
		printReverse(str1, 0);
		printReverse(str2, 0);

	}
	
	static void printReverse(String str, int start) {
		String sub = "";
		int len = str.length();
		int i = start;
		if(i < len) {
			while(i < len && str.charAt(i) != ' ') {
				sub += str.charAt(i);
				i++;
			}
			printReverse(str, ++i);
			
			if(start == 0) {
				System.out.println(sub);
			} else {
				System.out.print(sub + " ");
			}
		}
	}

}
