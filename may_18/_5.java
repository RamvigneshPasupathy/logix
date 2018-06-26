package may_18;

import java.util.ArrayList;

/*

	Given a 2D pixel matrix and a position p(x, y) and a color k,
	find the color present at the position p,
	and replace all the pixels (diagonally adjacent pixles are excluded) of the same color with k.
	
	Input:
		1 2 3 4
		1 2 3 4
		1 2 3 4
		1 3 2 4
		
		position: 2,2
		color: 5
		
	Output:
		1 2 5 4
		1 2 5 4
		1 2 5 4
		1 3 2 4
		
 */


public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pixels = {
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 3, 2, 4}
		};
		
		int x = 2;
		int y = 2;
		
		int k = 5;
		
		repalceColors(pixels, x, y, k);
		printMatirx(pixels);
		
	}
	
	public static void repalceColors(int[][] pixels, int x, int y, int k) {
		int c = pixels[x][y];
		
		for(int i=0; i<pixels.length; i++) {
			for(int j=0; i<pixels[i].length; j++) {
				if(pixels[i][j] == c) {
					pixels[i][j] = k;
				}
			}
		}
	}
	
	public static void printMatirx(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; i<mat[i].length; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
	}
	
	public static boolean isDiagonallyAdjacent(int i, int j, int x, int y, int lr, int lc) {
		
		int x1, x2, y1, y2;
		
		
		return true;
	}

}
