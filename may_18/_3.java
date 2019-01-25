package may_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3 {
	
/*
	Divide an array into 2 sub arrays such that the average of the sub arrays remain the same.
	
	Input: {1, 1, 3, 2, 3, 2}
	Output: {1, 2, 3}, {1, 2, 3}
	
	Input: {1, 4}
	Output: Not Possible
	
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\nTest Case 1");
		System.out.println("=======================");
		printSubArrays(new int[]{ 1, 1, 3, 2, 3, 2 });
		
		System.out.println("\n\nTest Case 2");
		System.out.println("=======================");
		printSubArrays(new int[]{ 1, 4 });
				
	}
		
	static void printSubArrays(int[] array) {
		int n = array.length;
		
		List<Integer[]> pairs = getPairs(n);
		System.out.println("\nSubArray Size Balance List");
		for(Integer[] i : pairs) {
			System.out.println(i[0] + " - " + i[1]);
		}
		
		// index pool - 0 to n-1
		Integer[] pool = new Integer[n];
		for(int i=0; i<n; i++) {
			pool[i] = i;
		}
		
		for(Integer[] pair : pairs) {
			int sub1Size = pair[0];
			
			// combination of all indices for sub arrays
			List<Integer[]> combinations = new ArrayList<Integer[]>();
			getCombinations(pool, new Integer[sub1Size], 0, (n - 1), 0, sub1Size, combinations);
			
			System.out.println("\nIndex Combinations for (" + pair[0] + " - " + pair[1] + ")");
			
			for(Integer[] c : combinations) {
				for(int i : c) System.out.print(i + " ");
				System.out.println();
			}
			
			System.out.println("\nTotal Combinations: " + combinations.size() + "\n");
			
			List<Integer> sub1 = new ArrayList<Integer>();
			List<Integer> sub2 = new ArrayList<Integer>();
			
			for(Integer[] combination : combinations) {
				List<Integer> combo = Arrays.asList(combination);
				int sum1 = 0;
				int sum2 = 0;
				for(int i=0; i<n; i++) {
					if(combo.contains(i)) sum1 += array[i];
					else sum2 += array[i];
				}
				float avg1 = (float) sum1 / combo.size();
				float avg2 = (float) sum2 / (n - combo.size());
				
				System.out.println("Sum1: " + sum1 + " -- " + "Sum2: " + sum2);
				System.out.println("Avg1: " + avg1 + " -- " + "Avg2: " + avg2);
				
				if(avg1 == avg2) {
					for(int i=0; i<n; i++) {
						if(combo.contains(i)) sub1.add(array[i]);
						else sub2.add(array[i]);
					}
					break;
				}
			}
			
			System.out.println("\nOutput:");
			if(sub1.size() > 0) {
				for(int i : sub1) System.out.print(i + " ");
				System.out.println();
				for(int i : sub2) System.out.print(i + " ");
				return;
			}
		}
		
		System.out.println("Not Possible");
	}
	
	static void getCombinations(Integer[] pool, Integer[] squad, int start, int end, int index, int squadSize, List<Integer[]> combinations) {
		if(index == squadSize) {
			Integer[] temp = new Integer[squadSize];
			int i = 0;
			for(int j : squad) {
				temp[i] = j;
				i++;
			}
			combinations.add(temp);
		} else {
			for(int i=start; i<=end && end - i + 1 >= squadSize - index; i++) {
				squad[index] = pool[i];
				getCombinations(pool, squad, i+1, end, index+1, squadSize, combinations);
			}
		}
	}
	
	static List<Integer[]> getPairs(int n) {
		List<Integer[]> pairs = new ArrayList<Integer[]>();
		
		for(int i=1; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(i + j == n) {
					pairs.add(new Integer[]{ i, j });
				}
			}
		}
		
		return pairs;
	}	

}
