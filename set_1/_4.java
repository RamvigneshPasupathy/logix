package set_1;

/*
 * https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
 * Given a 9×9 sudoku we have to evaluate it for its correctness.
 * We have to check both the sub matrix correctness and the whole sudoku correctness.
 * 
 */

public class _4 {
	
	static int row = 0;
	static int col = 0;
	static int [][] box = {
			{0, 0, 0, 1, 0, 0, 0, 0, 0},
			{6, 0, 9, 0, 0, 5, 0, 3, 8},
			{7, 2, 4, 0, 3, 0, 6, 0, 5},
			{0, 7, 0, 0, 0, 0, 0, 0, 4},
			{0, 3, 0, 4, 8, 2, 0, 5, 0},
			{4, 0, 0, 0, 0, 0, 0, 8, 0},
			{8, 0, 7, 0, 6, 0, 5, 9, 3},
			{3, 9, 0, 8, 0, 0, 1, 0, 6},
			{0, 0, 0, 0, 0, 3, 0, 0, 0}
	};
	
//	static int [][] box = {
//			{3, 0, 6, 5, 0, 8, 4, 0, 0},
//			{5, 2, 0, 0, 0, 0, 0, 0, 0},
//			{0, 8, 7, 0, 0, 0, 0, 3, 1},
//			{0, 0, 3, 0, 1, 0, 0, 8, 0},
//			{9, 0, 0, 8, 6, 3, 0, 0, 5},
//			{0, 5, 0, 0, 9, 0, 6, 0, 0},
//			{1, 3, 0, 0, 0, 0, 2, 5, 0},
//			{0, 0, 0, 0, 0, 0, 0, 7, 4},
//			{0, 0, 5, 2, 0, 6, 3, 0, 0}
//	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(solutionFound()) {
			printSolution(box);
		} else {
			System.out.println("This sudoku has no solution");
			printSolution(box);
		}
	}
	
	static boolean solutionFound() {
		if(emptyCellFound()) {
			for(int i=0; i<9; i++) {
				if(validFill(i+1)) {
					box[row][col] = i+1;
					if(solutionFound())
						return true;
					box[row][col] = 0;
				}
			}
			return false;
		}
		return true;
	}
	
	static boolean validFill(int num) {
		boolean rowAppearance = false;
		boolean colAppearance = false;
		boolean boxAppearance = false;
		
		System.out.println(row + ", " + col + " - validFill(" + num + ")");
		
		for(int j=0; j<9; j++) {
			if(box[row][j] == num) {
				rowAppearance = true;
				break;
			}
		}
		
		for(int i=0; i<9; i++) {
			if(box[i][col] == num) {
				colAppearance = true;
				break;
			}
		}
		
		int iStart = row / 3;
		int iEnd = (iStart + 1) * 3;
		int jStart = col / 3;
		int jEnd = (jStart + 1) * 3;
		for(int i=iStart; i<iEnd; i++) {
			for(int j=jStart; j<jEnd; j++) {
				if(box[i][j] == num) {
					boxAppearance = true;
					i=9;
					break;
				}
			}
		}
		
		return !rowAppearance && !colAppearance && !boxAppearance;
	}
	
	static boolean emptyCellFound() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(box[i][j] == 0) {
					row = i;
					col = j;
					return true;
				}
			}
		}
		return false;
	}
	
	static void printSolution(int[][] box) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(box[i][j] + " ");
			}
			System.out.println();
		}
	}

}
