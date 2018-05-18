package patterns;

/*
 	Input: 3
 	Output:
 		*         *
 		* *     * *
 		* * * * * *
 		* *     * *
 		*         *
 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n*2; j++) {
				if(j <= i) {
					System.out.print("* ");	
				} else if(j >= n * 2 - 1 - i) {
					System.out.print(" *");	
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();	
		}
		for(int i=n-2; i>=0; i--) {
			for(int j=0; j<n*2; j++) {
				if(j <= i) {
					System.out.print("* ");	
				} else if(j >= n * 2 - 1 - i) {
					System.out.print(" *");	
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();	
		}
	}

}
