package edu.leetcode.stringIntger;

public class _5LongestPalindromicSubstring {


    public String longestPalindrome(String s) {
        if(s==null||s.length()<=1){
            return s;
        }
        int n=s.length();
        int max=1;
        int start=0;
        int end=0;
        int len=0;
        int left=0;
        int right=0;
        int maxLeft=0;
        int maxRight=0;
        for(int i=1;i<n;i++){
            //Even
            len=0;
            start=i-1;
            end=i;
            left=start;
            right=end;
            while(start>=0&&end<n){
                if(s.charAt(start)!=s.charAt(end)){
                    break;
                }
                len+=2;
                left=start;
                right=end;
                start--;
                end++;
            }
            if(len>max){
                max=len;
                maxLeft=left;
                maxRight=right;
            }
            
            //odd
            len=1;
            start=i-1;
            end=i+1;
            left=start;
            right=end;
            while(start>=0&&end<n){
                if(s.charAt(start)!=s.charAt(end)){
                    break;
                }
                len+=2;
                left=start;
                right=end;
                start--;
                end++;
            }
            if(len>max){
                max=len;
                maxLeft=left;
                maxRight=right;
            }
        }
        return s.substring(maxLeft,maxRight+1);
    }

	
	/**
	 * O(N^3)
	 * @param s
	 * @return
	 */
    public String longestPalindrome1(String s) {
        if(s==null||s.length()<=1){
            return s;
        }
        String sub=new String();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    if(j-i>=sub.length()){
                        sub=s.substring(i,j);
                    }
                }
            }
        }
        return sub;
    }
    private boolean isPalindrome(String s){
        if(s.length()<=1||s==null){
            return true;
        }
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
