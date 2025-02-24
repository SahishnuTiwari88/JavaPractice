package com.basics;
import java.util.Stack;

public class Brackets {
	
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		char chars[] = str.toCharArray();
		for(char c : chars) {
			if(c == '{' || c == '(' || c == '[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char top = stack.pop();
					if((top == '{' && c == '}') || (top == '(' && c == ')') || (top == '[' && c == ']')) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "({[]}())";
		System.out.println("Brackets is : "+isValid(str));

	}

}
