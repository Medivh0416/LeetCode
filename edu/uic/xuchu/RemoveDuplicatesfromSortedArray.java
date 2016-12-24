package edu.uic.xuchu;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums=new int[]{1,2,2,3,4,5,5,5,6};
		System.out.println(removeDuplicates(nums)+"..."+nums.length);
		for(int i:nums){
			System.out.println(i);
		}
	}
	/**
	 * Easy
	 * 1.two pointer
	 * 2.one store the sum of different element numbers
	 * 3.another one store the same element numbers
	 * @param nums
	 * @return
	 */
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int sum=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[sum-1]){
                nums[sum]=nums[i];
                sum++;
            }
        }
        return sum;
    }

}
