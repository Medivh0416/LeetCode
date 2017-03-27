package edu.leetcode.binarySearch;

public class FindMinimuminRotatedSortedArray {
	

    public int findMin(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        
        int low=0;
        int high=nums.length-1;
        if(nums[high]>nums[low]){
            return nums[low];
        }
        int mid=0;
        while(high-low!=1){
            mid=(high+low)/2;
            if(nums[mid]<nums[low]){
                high=mid;
            }else{
                low=mid;
            }
        }
        
        return nums[high];
    }

	/**
	 * Easy
	 * 
	 * @param nums
	 * @return
	 */
	public int findMin2(int[] nums) {
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
