package set_33;

/*
	Given a two dimensional matrix of integers, print the rectangle that can be formed using the given indices.
	Also, find the sum of the elements in the rectangle.
	Input: 
		mat[m][n] = {
			{1, 2, 3, 4, 6},
			{5, 3, 8, 1, 2},
			{4, 6, 7, 5, 5},
			{2, 4, 8, 9, 4}
		}
		index = (2, 0) and (3, 4)
	Output:
		Rectangle:
			4 6 7 5 5
			2 4 8 9 4
		Sum: 54
 */

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat =  {
			{1, 2, 3, 4, 6},
			{5, 3, 8, 1, 2},
			{4, 6, 7, 5, 5},
			{2, 4, 8, 9, 4}
		};
		int i1 = 2;
		int j1 = 0;
		int i2 = 3;
		int j2 = 4;
		int sum = 0;
		System.out.println("Rectangle");
		for(int i=i1; i<=i2; i++) {
			for(int j=j1; j<=j2; j++) {
				sum += mat[i][j];
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.printf("Sum: %d", sum);
	}

}
