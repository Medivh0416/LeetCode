package edu.lintcode.codingInterviews;

public class BasicKnowledge {
	/**
	 * Easy
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(1==n){
            return 0;
        }
        if(2==n){
            return 1;
        }
        int a=0;
        int b=1;
        int sum=a+b;
        for(int i=4;i<=n;i++){
            a=b;
            b=sum;
            sum=a+b;
        }
        
        return sum;
    }
    
    
}
