package edu.uic.xuchu;

import org.junit.*;

public class ReverseInteger1 {

	public static void main(String[] args) {
		System.out.println(demo2(-10));
	}
	

	/**
	 * Easy
	 * 1.Single number's reverse equals itself
	 * 2.set a temp to store the Output
	 * 3.get the last digit of X (X%10) and remove it from X (X=X/10)
	 * 4.temp=temp*10+last digit of X
	 * 5.until X equals to 0
	 * 6.determine if X is out of Integer bounds
	 * @param x
	 * @return
	 */
	public static int demo2(int x){
		if(x<10&&x>-10){
			return x;
		}
		int temp=x;
		int result=0;
		while(x!=0){
			temp=x%10;
			result=result*10+temp;
			x=x/10;
			/**
			 * Must add if out of bound method
			 */
			if(result%10!=temp)
			{
			    result=0;
			    break;
			}
		}		
		return result;
	}
	/**
	 * Easy
	 * Another way
	 * 1.convert x to String
	 * 2.get each character from last digit of String
	 * 3.append digit to a StringBuilder
	 * 4.convert StringBuilder to Integer
	 * 5.determine if integer is out of bounds
	 * @param x
	 * @return
	 */
	public static int demo1(int x) {
		if (x < 10 && x > -10) {
			return x;
		}
		boolean plus = true;
		if (x < 0) {
			plus = false;
			x = x * -1;
		}
		String s = String.valueOf(x);
		StringBuilder sb = new StringBuilder();
		if (!plus) {
			sb.append("-");
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		try {
			int out = Integer.parseInt(sb.toString());
			return out;
		} catch (Exception e) {
			return 0;
		}
	}
}
