package edu.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintNumbersbyRecursion {

	/**
	 * Medium
	 * Condsider about the time
	 * ArrayList is faster than LinkedList
	 * @param n
	 * @return
	 */
	public List<Integer> numbersByRecursion(int n) {
        List<Integer> list=new ArrayList<Integer>();
        if(0==n){
            return list;
        }
        Recursion(n,list);
        return list;
    }
    
    private void Recursion(int n,List<Integer> list){
        if(n==0){
            return;
        }
        Recursion(n-1,list);
        int base=(int)Math.pow(10,n-1);
        int size=list.size();
        for(int i=1;i<10;i++){
            list.add(i*base);
            for(int j=0;j<size;j++){
                list.add(list.get(j)+i*base);
            }
        }
    }
}
