package edu.leetcode.array;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        if(nums.length==0||k==0){
            return;
        }
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        swap(nums,0,n-k-1);
        swap(nums,n-k,nums.length-1);
        swap(nums,0,nums.length-1);
    }
    
    private void swap(int[] nums,int start,int end){

        for(int i=start,j=end;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
