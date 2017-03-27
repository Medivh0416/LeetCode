package edu.leetcode.binarySearch;

public class FindPeakElement_162 {

	/**
	 * Use binary search
	 * Grow up the peek must be in the right
	 * Turn down the peek is mid  or in the left
	 * @param nums
	 * @return
	 */
    public int findPeakElement(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<high){
            mid=(low+high)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
        
    }

}
