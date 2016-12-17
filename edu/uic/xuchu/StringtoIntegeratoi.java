package edu.uic.xuchu;

public class StringtoIntegeratoi {

	public static void main(String[] args) {
		
		System.out.println(myAtoi("9223372036854775809"));
	}
	public static int myAtoi(String str) {
		boolean positive=true;
        str=str.trim();
        if(str==null||"".equals(str)){
            return 0;
        }
        int i=0;
        if(str.charAt(i)=='+'){
            positive=true;
            i++;
        }else if(str.charAt(i)=='-'){
            positive=false;
            i++;
        }
        double temp=0;
        for(;i<str.length();i++)
        {
            int digit =str.charAt(i)-'0';
            if(digit>=0&&digit<=9){
                temp=temp*10+digit;
            }else{
                break;
            }
        }
        if(!positive){
            temp*=-1;
        }
        if(temp>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(temp<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else{
            return (int)temp;
        }
        
    }
}
