package edu.uic.xuchu;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(11));
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
        double xTemp=(double)x;
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
