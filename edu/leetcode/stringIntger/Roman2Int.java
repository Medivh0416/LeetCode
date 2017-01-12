package edu.leetcode.stringIntger;

public class Roman2Int {
	/**
	 * EASY
	 * left<right  total=right-left
	 * left=>right total=right+left
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
        int i, total, pre, cur;  
  
        total = charToInt(s.charAt(0));  
  
        for (i = 1; i < s.length(); i++) {  
            pre = charToInt(s.charAt(i - 1));  
            cur = charToInt(s.charAt(i));  
  
            if (cur <= pre) {  
                total += cur;  
            } else {  
                total = total - pre * 2 + cur;  
            }  
        }  
  
        return total;  
    }
	/**
	 * Method that determine the value of each character 
	 * @param c
	 * @return
	 */
    public int charToInt(char c){
        int data=0;
        switch (c) {  
            case 'I':  
                data = 1;  
                break;  
            case 'V':  
                data = 5;  
                break;  
            case 'X':  
                data = 10;  
                break;  
            case 'L':  
                data = 50;  
                break;  
            case 'C':  
                data = 100;  
                break;  
            case 'D':  
                data = 500;  
                break;  
            case 'M':  
                data = 1000;  
                break;  
        }
        return data;
    }
}
