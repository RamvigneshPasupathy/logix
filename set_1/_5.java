package set_1;

import java.util.ArrayList;

/*
 	https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
	Given a two dimensional array of string like
	
	  <”luke”, “shaw”>
	  <”wayne”, “rooney”>
	  <”rooney”, “ronaldo”>
	  <”shaw”, “rooney”> 
	  
	Where the first string is “child”, second string is “Father”. 
	And given “ronaldo” we have to find his no of grandchildren.
	Here “ronaldo” has 2 grandchildren. So our output should be 2.
 */

public class _5 {
	
	static String[][] arr = {
			{"luke", "shaw"},
			{"wayne", "rooney"},
			{"rooney", "ronaldo"},
			{"shaw", "rooney"}
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grandChildrenCount = 0;
		ArrayList<String> children = getChildrenOf("ronaldo");
		for(String child: children) {
			grandChildrenCount += getChildrenOf(child).size();
		}
		System.out.println(grandChildrenCount);
 
	}
	
	static ArrayList<String> getChildrenOf(String name) {
		ArrayList<String> children = new ArrayList<String>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i][1] == name) {
				children.add(arr[i][0]);
			}
		}
		return children;
	}
	
}
