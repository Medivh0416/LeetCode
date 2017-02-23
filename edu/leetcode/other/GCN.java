package edu.leetcode.other;

import org.junit.Test;

public class GCN {

	@Test
	public void test1(){
		System.out.println(gcn(60,24));
	}
	public int gcn(int m,int n){
		if(n>m){
			int temp=n;
			n=m;
			m=temp;
		}
		int r=m%n;
		if(r==0){
			return n;
		}
		return gcn(n,r);
	}
}
