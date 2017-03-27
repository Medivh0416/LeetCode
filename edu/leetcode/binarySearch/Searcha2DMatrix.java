package edu.leetcode.binarySearch;

public class Searcha2DMatrix {
	/**
	 * Easy: 10 Min
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        int count =0;
        if(0==matrix.length){
            return 0;
        }
        
        for(int r=0;r<matrix.length;r++){
            if(matrix[r][0]>target){
                break;
            }
            for(int c=0;c<matrix[r].length;c++){
                if(matrix[r][c]==target){
                    count++;
                }
                if(matrix[r][c]>target){
                    break;
                }
            }
        }
        return count;
    }
}
