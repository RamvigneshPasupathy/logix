package set_1;

/*
	https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
	Print the word with odd letters as
	
	P         M
	 R      A
	   O  R
	     G
	  O    R
	 R       A
	P          M
*/ 

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "program";
		int len = str.length();
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(j == i || j == (len - i - 1)) {
					System.out.print(str.charAt(i));	
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
