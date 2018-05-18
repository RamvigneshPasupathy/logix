package patterns;

/*
	Input: 4
	Output:
		1
		2 5
		3 6 8
		4 7 9 10
 */
public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1; i<=n; i++) {
			int num=i;
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", num);
				num += n - j;
			}
			System.out.println();
		}
	}

}
