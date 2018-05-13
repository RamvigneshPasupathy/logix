package set_3;

/*
	https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
	Write a program to print the following output for the given input. You can assume the string is of odd length
	
	Eg 1: Input: 12345
	      Output:
	1       5
	  2   4
	    3
	  2  4
	1      5
	Eg 2: Input: geeksforgeeks
	      Output:
	g                         s
	  e                     k
	    e                 e
	      k             e
	        s         g
	          f      r
	             o
	          f     r
	        s         g
	      k             e
	    e                 e
	  e                      k
	g                          s
	
 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "12345";
		String str2 = "geeksforgeeks";
		printString(str1);
		printString(str2);
	}
	
	static void printString(String str) {
		int len = str.length();
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(j == i || j == (len - i -1)) {
					System.out.printf("%c ", str.charAt(j));
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
