package misc;

public class _combinations {

	static String[] pool = {
			"Dhawan", "Rohit", "Kohli", "Raina", "Yuvi", "Dhoni", "Ashwin", "Jadeja", "Bhuvi", "Umesh",
			"Chahal", "Kuldeep", "Bumrah", "Rayudu", "Kaul"
	};
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int squadSize = 11;
		String[] squad = new String[squadSize];
		printCombinations(pool, squad, 0, pool.length - 1, 0, squadSize);
		System.out.println("Total Combinations: " + count);
	}
	
	// index => index of the squad
	// i => index of the pool
	public static void printCombinations(String[] pool, String[] squad, int start, int end, int index, int squadSize) {
		if(index == squadSize) {
			// printArray(squad);
			count++;
		} else {
			for(int i=start; i<=end && end - i + 1 >= squadSize - index; i++) {
				squad[index] = pool[i];
				printCombinations(pool, squad, i+1, end, index+1, squadSize);
			}
		}
		
	}
	
	public static void printArray(String[] arr) {
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
