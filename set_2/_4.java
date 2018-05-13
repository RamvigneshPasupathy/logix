package set_2;

import java.util.Stack;

/*
 	https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
	Check whether a given mathematical expression is valid.

    Eg.  Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid 
 */

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "(a+b)(a*b)";
		String str2 = "(ab)(ab+)";
		String str3 = "((a+b)";
		
		System.out.println(isExpressionValid(str1));
		System.out.println(isExpressionValid(str2));
		System.out.println(isExpressionValid(str3));
	}
	
	static String isExpressionValid(String str) {
		int len = str.length();
		
		if(isOperator(str.charAt(0)) || isOperator(str.charAt(len - 1))) {
			return "Invalid";
		}
		
		Stack<Character> tokenStack = new Stack<Character>();
		for(int i=0; i<len; i++) {
			if(str.charAt(i) == '(') {
				tokenStack.push('(');
			} else if(str.charAt(i) == ')') {
				if(!tokenStack.isEmpty() && tokenStack.peek() == '(') {
					tokenStack.pop();
				} else {
					tokenStack.push(')');	
				}
				
			} else if(isOperand(str.charAt(i)) && i < len-1) {
				if(isOperand(str.charAt(i+1))) {
					return "Invalid";
				}
			} else if(isOperator(str.charAt(i)) && i < len-1) {
				if(isOperator(str.charAt(i+1))) {
					return "Invalid";
				}
			}
		}
		
		if(tokenStack.isEmpty()) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}
	
	static boolean isOperator(char c) {
		String operators = "[+/*-]";
		return (c+"").matches(operators);
	}
	
	static boolean isOperand(char c) {
		String operands = "[A-z]";
		return (c+"").matches(operands);
	}

}
