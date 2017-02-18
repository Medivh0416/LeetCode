package edu.leetcode.bp;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            sum=Math.max(0,sum);
            sum+=num;
            max=Math.max(max,sum);
        }
        return max;
    }
}
