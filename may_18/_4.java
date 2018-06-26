package may_18;

/*
	Pattern printing.
	
	Input: "racecar"
	Output:
	      e
	    c   c
	  a       a
	r           r
	  a       a
	    c   c
	      e
	      
	Input: "football"
	Output: Not Possible
	
 */

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar";
		int len = s.length();
		int center = len / 2;
		if(len % 2 == 0) {
			System.out.println("Not Possible");
		} else {
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					if(i<=center) {
						if(i == center - j || i == -(center -j)) {
							System.out.print(s.charAt(j) + " ");	
						} else {
							System.out.print("  ");
						}
					} else {
						if(i == center + j || i == len - 1 - j + center) {
							System.out.print(s.charAt(j) + " ");	
						} else {
							System.out.print("  ");
						}
					}	
				}
				System.out.println();
			}
		}
	}

}
