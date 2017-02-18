package edu.leetcode.bp;

import java.util.ArrayList;

public class MajorityNumber {
    public int majorityNumber(ArrayList<Integer> nums) {
        int candidate=0;
        int count=0;
        while(!nums.isEmpty()){
            if(0==count){
                candidate=nums.remove(0);
                count=1;
            }else if(nums.remove(0)==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
