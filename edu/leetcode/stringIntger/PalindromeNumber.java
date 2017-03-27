package edu.leetcode.stringIntger;

public class PalindromeNumber {

    
    private int digit(int x){
        int count=0;
        while(x!=0){
            x=x/10;
            count++;
        }
        return count;
    }
    /**
     * Use double pointer
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        int count=digit(x);
        int half=count/2;
        int n=x;
        int p=(int)Math.pow(10,count-1);
        for(int i=0;i<half;i++){
            if(x/p%10==n%10){
                n=n/10;
                p=p/10;
            }
            else{
                return false;
            }
            
        }
        return true;
    }

	/**
	 * Easy
	 * Like what I did in previous ReverseInteger
	 * 1.negative number can not be PalindromeNumber
	 * 2.range[0,9] must be a PalindromeNumber
	 * 3.convert All int to Double, in case of OverFlow
	 * @param x
	 * @return
	 */
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x<=9){
            return true;
        }
        double xTemp=x;
        double temp=0;
        double revsX=0;
        while(x!=0){
            temp=x%10;
            revsX=revsX*10+temp;
            x=x/10;
        }
        if(revsX==xTemp){
            return true;
        }
        return false;
        
    }
}
