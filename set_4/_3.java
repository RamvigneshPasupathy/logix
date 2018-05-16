package set_4;


/*

	Output the number in words (0 - 999)
	Input: 234
	Output: Two hundred and Thirty Four 

 */
public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(234);
		printNumber(104);
		printNumber(711);
		printNumber(63);
	}
	
	static void printNumber(int n) {
		int ones = n % 10;
		int tens = n / 10 % 10;
		int hundreds = n / 100;
		String number = "";
		if(hundreds > 0) {
			number = getNumber(hundreds) + " hundred and ";
		}
		if(tens > 1) {
			number += getTensNumber(tens) + " ";
		} 
		if(tens == 1) {
			number += getElevensNumber(ones);
		} else if(ones > 0) {
			number += getNumber(ones);
		}
		System.out.println(number);
	}
	
	static String getNumber(int n) {
		switch(n) {
			case 1: 
				return "One";
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";
			default:
				return "";
		}
	}
	
	static String getTensNumber(int n) {
		switch(n) {
			case 2:
				return "Twenty";
			case 3:
				return "Thirty";
			case 4:
				return "Forty";
			case 5:
				return "Fifty";
			case 6:
				return "Sixty";
			case 7:
				return "Seventy";
			case 8:
				return "Eighty";
			case 9:
				return "Ninety";
			default:
				return "";
		}
	}
	
	static String getElevensNumber(int n) {
		switch(n) {
			case 1:
				return "Eleven";
			case 2:
				return "Twelve";
			case 3:
				return "Thirteen";
			case 4:
				return "Forteen";
			case 5:
				return "Fifteen";
			case 6:
				return "Sixteen";
			case 7:
				return "Seventeen";
			case 8:
				return "Eighteen";
			case 9:
				return "Nineteen";
			default:
				return "Ten";
		}
	}

}
