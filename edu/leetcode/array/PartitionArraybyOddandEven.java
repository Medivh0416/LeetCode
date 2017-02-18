package edu.leetcode.array;

public class PartitionArraybyOddandEven {
	/**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {

        int start=0;
        int end=nums.length-1;
        while(start<end){
            while(nums[start]%2==1&&start<end){
                start++;
            }
            while(nums[end]%2==0&&start<end){
                end--;
            }
            if(start<end&&(nums[start]%2==0)&&(nums[end]%2==1)){
                int temp=nums[end];
                nums[end]=nums[start];
                nums[start]=temp;
            }
        }
    }
}
