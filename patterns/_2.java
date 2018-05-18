package patterns;

/*
	Input: 5
	Output:
	1 1 1 1 1
	1 1 1 2 2
	1 1 3 3 3
	1 4 4 4 4
	5 5 5 5 5
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j > n-i) {
					System.out.printf("%d ", i);
				} else {
					System.out.printf("%d ", 1);	
				}
			}
			System.out.println();
		}

	}

}
