package set_4;


/*

	Print the given pattern
	Input: M=3, N=3
	Output:
	X X X
	X 0 X
	X X X
	
	Input: M=4, N=5
	Output:
	X X X X
	X 0 0 X
	X 0 0 X
	X 0 0 X
	X X X X
	
	Input: M=6, N=7
	Output:
	X X X X X X
	X 0 0 0 0 X
	X 0 X X 0 X
	X 0 X X 0 X
	X 0 X X 0 X
	X 0 0 0 0 X
	X X X X X X
	
 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] a = getMatrix(6, 7);
		printMatrix(a);

	}
	
	static char[][] getMatrix(int rows, int cols) {
		char[][] a = new char[rows][cols];
		int sr = 0;
		int er = rows;
		int sc = 0;
		int ec = cols;
		int round = 0;
		while(sr < er && sc < ec) {
			char c = round % 2 == 0 ? 'X' : 'O';
			for(int i=sc; i<ec; i++) {
				a[sr][i] = c;
			}
			sr++;
			for(int i=sr; i<er; i++) {
				a[i][ec-1] = c;
			}
			ec--;
			if(sc < ec) {
				for(int i=ec-1; i>=sc; i--) {
					a[er-1][i] = c;
				}
				er--;
			}
			if(sr < er) {
				for(int i=er-1; i>=sr; i--) {
					a[i][sc] = c;
				}
				sc++;
			}
			round++;
		}
		return a;
	}
	
	static void printMatrix(char[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%c ", a[i][j]);
			}
			System.out.println();
		}
	}

}
