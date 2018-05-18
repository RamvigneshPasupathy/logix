package set_32;


/*
	 With an array of strings and a word was given,
	 Print all anagrams for the word from the given array.
	 Input: {lion, king, tea, mon, and, pumba}, eat
	 Output: tea
 */

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"lion", "king", "tea", "mon", "and", "pumba"};
		String word = "eat";
		printAnagrams(words, word);
	}
	
	static void printAnagrams(String[] words, String word) {
		char[] wordArray = word.toCharArray();
		int len = word.length();
		mergeSort(wordArray, 0, len - 1);
		for(int i=0; i<words.length; i++) {
			if(len == words[i].length()) {
				char[] tempArray = words[i].toCharArray();
				mergeSort(tempArray, 0, len - 1);
				boolean anagramFound = true;
				for(int j=0; j<len; j++) {
					if(tempArray[j] != wordArray[j]) {
						anagramFound = false;
						break;
					}
				}
				if(anagramFound) {
					System.out.println(tempArray);
				}
			}
		}
	}
	
	static void mergeSort(char[] arr, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2;
			mergeSort(arr, left, center);
			mergeSort(arr, center + 1, right);
			merge(arr, left, center, right);
		}
	}
	
	static void merge(char[] arr, int left, int center, int right) {
		int leftSize = center - left + 1;
		int rightSize = right - center;
		char[] leftArr = new char[leftSize];
		char[] rightArr = new char[rightSize];
		
		for(int i=0; i<leftSize; i++) {
			leftArr[i] = arr[left + i];
		}
		
		for(int j=0; j<rightSize; j++) {
			rightArr[j] = arr[center + j + 1];
		}
		
		int i=0, j=0, k=left;
		while(i<leftSize && j<rightSize) {
			if(leftArr[i] < rightArr[j]) {
				arr[k++] = rightArr[j++];
			} else {
				arr[k++] = leftArr[i++];
			}
		}
		
		while(i<leftSize) {
			arr[k++] = leftArr[i++];
		}
		
		while(j<rightSize) {
			arr[k++] = rightArr[j++];
		}
	}
}
