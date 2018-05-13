package set_3;

/*
 	https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
	Write a program to give the following output for the given input
	
	Eg 1: Input: a1b10
	      Output: abbbbbbbbbb
	Eg 2: Input: b3c6d15
	      Output: bbbccccccddddddddddddddd
	       
	The number varies from 1 to 99.

*/

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "a1b10";
		String str2 = "b3c6d15";
		
		printResultFor(str1);
		printResultFor(str2);
	}
	
	static void printResultFor(String str) {
		int len = str.length();
		char alpha = str.charAt(0);
		for(int i=1; i<len; i++) {
			if(isDigit(str.charAt(i))) {
				if(i < len-1 && isDigit(str.charAt(i+1))) {
					int num = Integer.parseInt(str.charAt(i) + "" + str.charAt(i+1));
					printer(alpha, num);
					i++;
				} else {
					int num = Integer.parseInt(str.charAt(i) + "");
					printer(alpha, num);
				}
			} else {
				alpha = str.charAt(i);
			}
		}
		System.out.println();
	}
	
	static void printer(char c, int num) {
		for(int i=0; i<num; i++) {
			System.out.print(c);
		}
	}
	
	static boolean isDigit(char c) {
		String digits = "[0-9]";
		return (c+"").matches(digits);
	}

}
