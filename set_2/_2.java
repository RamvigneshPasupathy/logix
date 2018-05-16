package set_2;

import java.util.Stack;

/*
 	https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
	Remove unbalanced parentheses in a given expression.

    Eg. Input  : ((abc)((de))
        Output : ((abc)(de))  

        Input  : (((ab)
        Output : (ab) 
 */

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "((abc)((de))";
		String str2 = "(((ab)";
		
		System.out.println(correctParantheses(str1));
		System.out.println(correctParantheses(str2));

	}
	
	static String correctParantheses(String str) {
		
		String result = "";
		
		Stack<Character> tokenStack = new Stack<Character>();
		Stack<Integer> indexStack = new Stack<Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char token = str.charAt(i);
			if(token == '(') {
				tokenStack.push(token);
				indexStack.push(i);
			} else if(token == ')') {
				if(!tokenStack.isEmpty() && tokenStack.peek() == '(') {
					tokenStack.pop();
					indexStack.pop();
				} else {
					tokenStack.push(token);
					indexStack.push(i);	
				}
			} else { }
		}
		
		for(int i=0; i<str.length(); i++) {
			if(!indexStack.contains(i)) {
				result += str.charAt(i);
			}
		}
		
		return result;
	}

}
