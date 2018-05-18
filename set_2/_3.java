package set_2;

import java.util.ArrayList;
import java.util.Scanner;

/*
	https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
	Form a number system with only 3 and 4. Find the nth number of the number system.
	Eg. The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444,
	3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
 
*/

public class _3 {
	
	static int arr[] = {3, 4};
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int index = scanner.nextInt();
		
		printNumberAt(index);
		
	}
	
	static void printNumberAt(int index) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			output.add(arr[i]);
		}
		
		if(index == 1) {
			System.out.println('3');
			return;
		} else if(index == 2) {
			System.out.println('4');
			return;
		} else {
			int i = 3;
			while(true) {
				ArrayList<Integer> temp = (ArrayList<Integer>) output.clone();
				output.clear();
				
				for(int j=0; j<temp.size(); j++) {
					for(int k=0; k<arr.length; k++) {
						int element = temp.get(j) * 10 + arr[k];
						if(index == i) {
							System.out.println(element);
							return;
						}
						output.add(element);
						i++;
					}
				}
			}
		}
	}
	
	static void solution101(int n) {
		for(int i=1, j=3; i<=n; j++) {
			String str = j+"";
			boolean validString = true;
			for(int k=0; k<str.length(); k++) {
				if(!(str.charAt(k) == '3' || str.charAt(k) == '4')) {
					validString = false;
					break;
				}
			}
			if(validString) {
				System.out.println(str);
				if(i == n) {
					System.out.printf("Answer: %s", str);
				}
				i++;
			}
		}
	}
}
