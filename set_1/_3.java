package set_1;

/*
	Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
	
	w	e	L	C	O
	M	E	T	O	Z
	O	H	O	C	O
	R	P	O	R	A
	T	I	O	n	  
	And print the start and ending index as
	
	Start index : <1,2>
	End index: <3, 2>
 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcometozohocorporation";
		char[][] arr= new char[5][5];
		int k = 0;
		int len = str.length();
		for(int i=0; i<5 && k < len ; i++) {
			for(int j=0; j<5 && k < len; j++) {
				arr[i][j] = str.charAt(k);
				k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == 't' && arr[i][j + 1] == 'o' && arr[i][j + 2] == 'o') {
					System.out.printf("Start Index: <%d, %d>\n", i, j);
					System.out.printf("End Index: <%d, %d>\n", i, (j + 2));
				}
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(arr[j][i] == 't' && arr[j + 1][i] == 'o' && arr[j + 2][i] == 'o') {
					System.out.printf("Start Index: <%d, %d>\n", j, i);
					System.out.printf("End Index: <%d, %d>\n", (j + 2), i);
				}
			}
		}
	}
}
