package edu.leetcode.array;

public class Search2DMatrix {
	/**
	 * 
	 * Easy
	 * First compare the first element of each row
	 * Then find the nearst row which smaller than target
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix==null){
            return false;
        }
        if(matrix.length==0){
            return false;
        }
        int i;
        for(i=0;i<matrix.length;i++){
            if(target<matrix[i][0]){
                if(i==0){
                    return false;
                }
                for(int s=0;s<matrix[i-1].length;s++){
                    if(target==matrix[i-1][s]){
                        return true;
                    }
                }
            }
        }
        i=i-1;
        for(int n=0;n<matrix[i].length;n++){
            if(target==matrix[i][n]){
                return true;
            }
        }
        return false;
    }
}
