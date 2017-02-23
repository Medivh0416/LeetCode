package edu.leetcode.other;

import java.util.ArrayList;

public class UgleNumber2 {
	
	public static void main(String[] args) {
		System.out.println(1^10);
	}
	
	public static int nthUglyNumber(int n) {
        int result = 1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i2=1;
        int i3=1;
        int i5=1;
        list.add(result);
        while(list.size()<n){
            result=Math.min(2*i2,Math.min(3*i3,5*i5));
            if(result==2*i2){
                i2++;
            }
            if(result==3*i3){
                i3++;
            }
            if(result==5*i5){
                i5++;
            }
            list.add(result);
        }
        for(int i:list){
        	System.out.print(i+" ");
        }
        return list.get(list.size()-1);
    }
	
	public static int nthUglyNumber2(int n) {
        int result = 1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i2=0;
        int i3=0;
        int i5=0;
        list.add(result);
        while(list.size()<n){
            result=Math.min(2*list.get(i2),Math.min(3*list.get(i3),5*list.get(i5)));
            if(result==2*list.get(i2)){
                i2++;
            }
            if(result==3*list.get(i3)){
                i3++;
            }
            if(result==5*list.get(i5)){
                i5++;
            }
            list.add(result);
        }
        for(int i:list){
        	System.out.print(i+" ");
        }
        return list.get(list.size()-1);
	}
}
