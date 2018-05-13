package set_3;

/*
	https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
	Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
	Eg 1:
		Input:
        String 1: test123string
        String 2: 123
        Output: 4
	Eg 2: 
		Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
*/

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "test123string";
		String sub1 = "123";
		
		String str2 = "testing12";
		String sub2 = "1234";
		
		printSubstringIndex(str1, sub1);
		printSubstringIndex(str2, sub2);

	}
	
	static void printSubstringIndex(String str, String sub) {
		int L = str.length();
		int l = sub.length();
		for(int i=0; i<=L-l;i++) {
			for(int j=0; j<l; j++) {
				if(sub.charAt(j) != str.charAt(i+j)) {
					break;
				} else if(j == l-1) {
					 System.out.println(i);
					 return;
				}
			}
		}
		System.out.println(-1);
	}

}
