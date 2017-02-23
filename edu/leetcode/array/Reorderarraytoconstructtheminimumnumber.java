package edu.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class Reorderarraytoconstructtheminimumnumber {   
	/**
     * @param nums n non-negative integer array
     * @return a string
     */
    public String minNumber(int[] nums) {
        if(null==nums||nums.length==0){
            return "";
        }
        if(nums.length==1){
            return String.valueOf(nums[0]);
        }
        String[] strings=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strings[i]=String.valueOf(nums[i]);
        }
        
        Arrays.sort(strings,new Comparator<String>(){
            public int compare(String s1,String s2){
                String ab=s1.concat(s2);
                String ba=s2.concat(s1);
                return ab.compareTo(ba);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:strings){
            if(!s.equals("0")){
                sb.append(s);
            }
        }
        
        return sb.toString().equals("")?"0":sb.toString();
    }
}
