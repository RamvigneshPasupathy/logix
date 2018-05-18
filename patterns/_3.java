package patterns;

/*
	Input: 5
	Output:
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		for(int i=n-1; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}	
	}

}
