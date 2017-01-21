package edu.leetcode.stringIntger;

public class TwoSum {


	/**
	 * Easy
	 * 1.Two For Loop
	 * 2.Calculate each sum
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {

        int i;
        int j;
        int sum;
        for(i=0;i<nums.length;i++)
        {
            for(j=i;j<nums.length;j++)
            {
                sum=nums[i]+nums[j];
                if(target==sum)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    
}

