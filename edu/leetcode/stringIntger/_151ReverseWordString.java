package edu.leetcode.stringIntger;

import org.junit.Test;

public class _151ReverseWordString {
	public class Solution {
	    public String reverseWords(String s) {
	    	//Conner case
	        if(null==s){
	            return null;
	        }else if(s.length()<1){
	            return s;
	        }
	        char[] str=s.toCharArray();
	        
	        //reverse all the str
	        str=reverse(str,0,s.length()-1);
	        int i=0;
	        int j=0;
	        int n=str.length;
	        while(j<n){
	            while(i<n&&str[i]==' '){
	                i++;
	            }
	            j=i;
	            while(j<n&&str[j]!=' '){
	                j++;
	            }
	            str=reverse(str,i,j-1);
	            i=j;
	        }
	        return clean(str);
	        
	    }
	    
	    private String clean(char[] s){
	        int i=0;
	        int j=0;
	        int n=s.length;
	        while(i<n){
	            while(i<n&&s[i]==' '){
	                i++;
	            }
	            while(i<n&&s[i]!=' '){
	                s[j++]=s[i++];
	            }
	            while(i<n&&s[i]==' '){
	                i++;
	            }
	            if(i<n){
	                s[j++]=' ';
	            }
	        }
	        return new String(s).substring(0,j);
	    }
	    
	    private char[] reverse(char[] s,int start,int end){
	        if(null==s){
	            return null;
	        }else if(s.length==1){
	            return s;
	        }
	        while(start<end){
	            char temp=s[start];
	            s[start++]=s[end];
	            s[end--]=temp;
	        }
	        return s;
	        
	    }
	}
}
