package edu.leetcode.array;

public class FindMinimuminRotatedSortedArray {
	/**
	 * Easy
	 * 
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
        if(0==nums.length){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }

}
