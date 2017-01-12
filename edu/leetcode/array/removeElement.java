package edu.leetcode.array;

public class removeElement {
	/**
	 * Easy
	 * 1.set two pointer
	 * 2.one record the number of element that different as val
	 * 3.one is arrayList pointer
	 * 4.get each element from arrayList compare to val
	 * 5.chane the value of same val 
	 * @param nums
	 * @param val
	 * @return
	 */
    public int removeElement(int[] nums, int val) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[sum]=nums[i];
                sum++;
            }
        }
        return sum;
    }
}
