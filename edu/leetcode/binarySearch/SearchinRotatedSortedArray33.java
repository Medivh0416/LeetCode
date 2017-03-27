package edu.leetcode.binarySearch;

public class SearchinRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[low]<nums[mid]||nums[mid]>nums[high]){
                if(nums[low]<=target&&nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[high]>=target&&nums[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }


}
