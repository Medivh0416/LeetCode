package edu.leetcode.binarySearch;

public class SearchinRotatedSortedArray81 {
    public boolean search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return false;
        }
        
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(low<=high){
            mid=(high+low)/2;
            if(nums[mid]==target){
                return true;
            }
            
            if(nums[low]<nums[mid]||nums[mid]>nums[high]){
                if(nums[low]<=target&&nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]<nums[high]||nums[mid]<nums[low]){
                if(nums[high]>=target&&nums[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                high--;
            }
        }
        return false;
    }


}
