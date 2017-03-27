package edu.leetcode.array;

import java.util.Comparator;

import org.junit.Test;

public class BinarySearch<T> {
	
	@Test
	public void test(){
		BinarySearch<Integer> bin=new BinarySearch<Integer>();
		Integer[] nums=new Integer[]{1,2,3,4,5,6,7,8,12};
		System.out.println(bin.binarySearch(nums, 13));
	}

	private Comparator<T> comp;
	private int compare(T a,T b){
		if(comp!=null){
			return comp.compare(a, b);
		}else{
			Comparable<T> c=(Comparable<T>) a;
			return c.compareTo(b);
		}
	}

	public int binarySearch(T[] nums,T num){
		if(nums.length==0||nums==null){
			return -1;
		}
		int low=0;
		int high=nums.length-1;
		int mid=(low+high)/2;
		while(mid>=low&&mid<=high){
			if(num.equals(nums[mid])){
				return mid;
			}else if(compare(num, nums[mid])<0){
				high=mid-1;
				mid=(low+high)/2;
			}else{
				low=mid+1;
				mid=(low+high)/2;
			}
		}
		return -1;
	}
}
