package edu.leetcode.stack;

import java.util.Collections;
import java.util.Stack;

public class SimplifyPath_71 {
	
	public static void main(String[] args) {
		String str="/a/./b/../../c/";
		System.out.println(simplifyPath(str));
	}
	
    public static String simplifyPath(String path) {
        if(path==null&&path.length()==0){
            return path;
        }
        Stack<String> stack=new Stack<String>();
        String[] strs=path.split("/");
        for(String s:strs){
        	if(s.equals("")||s.equals(".")){
        		
        	}else if(s.equals("..")){
        		if(!stack.isEmpty()){
        			stack.pop();
        		}
        	}else{
        		stack.push(s);
        	}
        }
        if(stack.isEmpty()){
        	return "/";
        }
        StringBuilder sb=new StringBuilder();
        Collections.reverse(stack);
        while(!stack.isEmpty()){
        	sb.append("/"+stack.pop());
        }
        
        return sb.toString();
    }
    
   
}
