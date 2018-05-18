package set_33;

/*
	Find the result subtraction, multiplication, division of 2 integers using + operator.
	Input: 6 and 4
	Output:
		addition: 10
		subtraction: 2
		multiplication: 24
		division: 1
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printResults(6, 4);
		printResults(-6, -4);
		printResults(-6, 4);
		printResults(6, -4);
	}
	
	static void printResults(int i, int j) {
		int sum = i + j;
		int diff = i + (-j);
		int product = 0;
		int quotient = 0;
		
		boolean iNegative = i<0;
		boolean jNegative = j<0;
		i = iNegative ? -i : i;
		j = jNegative ? -j : j;
		
		for(int k=0; k<j; k++) {
			product += i;
		}
		
		product = iNegative ? -product : product;
		product = jNegative ? -product : product;
		
		while(true) {
			i += (-j);
			if(i>0) {
				quotient += 1;
			} else {
				break;
			}
		}
		
		quotient = iNegative ? -quotient : quotient;
		quotient = jNegative ? -quotient : quotient;
		
		System.out.println("addition: " + sum);
		System.out.println("subtraction: " + diff);
		System.out.println("multiplication: " + product);
		System.out.println("quotient: " + quotient);
		System.out.println();
	}

}
