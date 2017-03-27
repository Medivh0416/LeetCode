package edu.leetcode.binarySearch;

public class FindMinimuminRotatedSortedArrayII154 {
	
	/**
	 * 1. Clear the dupulte element in first and end
	 * @param nums
	 * @return
	 */
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(nums[low]==nums[high]&&low<high){
            high--;
        }
        while(low<high){
            if(nums[low]<nums[high]){
                return nums[low];
            }
            mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }


}
