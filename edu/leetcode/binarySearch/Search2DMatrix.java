package edu.leetcode.binarySearch;

public class Search2DMatrix {
	
	public static void main(String[] args) {
		int[][] matrix=new int[][]{{1,3}};

	}

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int rows=matrix.length-1;
        int cols=matrix[0].length-1;
        int row=searchCol(matrix,cols,target);
        if(row<0||row>rows){
            return false;
        }
        return searchRow(matrix[row],target);
    }
    private int searchCol(int[][] nums,int cols,int target){

        int high=nums.length-1;
        int low=0;
        int mid=(high+low)/2;
        while(low<=high){
            if(nums[mid][cols]>target){
                high=mid-1;
                mid=(high+low)/2;
            }else if(mid<nums.length&&nums[mid][cols]<target){
                low=mid+1;
                mid=(high+low)/2;
            }else{
                return mid;
            }
        }
        return low;
    }
    
    private boolean searchRow(int[] nums,int target){
        int high=nums.length-1;
        int low=0;
        int mid=(high+low)/2;
        while(low<=high){
            if(nums[mid]>target){
                high=mid-1;
                mid=(high+low)/2;
            }else if(nums[mid]<target){
                low=mid+1;
                mid=(high+low)/2;
            }else{
                return true;
            }
        }
        return false;
    }

	
	/**
	 * 
	 * Easy
	 * First compare the first element of each row
	 * Then find the nearst row which smaller than target
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
//    public boolean searchMatrix(int[][] matrix, int target) {
//        // write your code here
//        if(matrix==null){
//            return false;
//        }
//        if(matrix.length==0){
//            return false;
//        }
//        int i;
//        for(i=0;i<matrix.length;i++){
//            if(target<matrix[i][0]){
//                if(i==0){
//                    return false;
//                }
//                for(int s=0;s<matrix[i-1].length;s++){
//                    if(target==matrix[i-1][s]){
//                        return true;
//                    }
//                }
//            }
//        }
//        i=i-1;
//        for(int n=0;n<matrix[i].length;n++){
//            if(target==matrix[i][n]){
//                return true;
//            }
//        }
//        return false;
//    }
}
