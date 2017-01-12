package edu.leetcode.stringIntger;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("[([]])"));
	}
	
	/**
	 * EASY
	 * seeing question like this, should think about stack first
	 * 1.get each character of the String
	 * 2.if char=(,{,[, push into stack
	 * 3.if char=),},], pop stack if is paired 
	 * 4.until end of loop,if stack is empty,return  true
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		boolean valid=false;
		Stack<Character> stack =new Stack<Character>();
		char ch;
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='['){
				stack.push(ch);
			}
			if(ch==')'||ch==']'||ch=='}'){
				if(stack.empty()){
					return false;
				}
				switch(ch){
				case ')':
					if(stack.pop()=='('){
						valid=true;
					}else{
						return false;
					}
					break;
				case '}':
					if(stack.pop()=='{'){
						valid=true;
					}else{
						return false;
					}
					break;
				case ']':
					if(stack.pop()=='['){
						valid=true;
					}else{
						return false;
					}
					break;
				}
			}
		}
		if(!stack.isEmpty()){
			valid=false;
		}
		return valid;
	}
}
