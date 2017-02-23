package edu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/**
	 * SprialMatrix 1
     * @param matrix a matrix of m x n elements
     * @return an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        if(null==matrix){
            return null;
        }
        if(matrix.length==0||matrix[0].length==0){
            return list;
        }
        int rowE=matrix.length-1;
        int colE=matrix[0].length-1;
        int rowS=0;
        int colS=0;
        while(rowS<=rowE&&colS<=colE){
            for(int m=colS;m<=colE;m++){
                list.add(matrix[rowS][m]);
            }
            rowS++;
            
            for(int n=rowS;n<=rowE;n++){
                list.add(matrix[n][colE]);
            }
            colE--;
            
            if(rowS<=rowE){
            for(int i=colE;i>=colS;i--){
                list.add(matrix[rowE][i]);
            }
            rowE--;
            }
            if(colS<=colE){
            for(int j=rowE;j>=rowS;j--){
                list.add(matrix[j][colS]);
            }
            colS++;
            }
        }
        return list;
    }
	
    /**
     * SprialMatrix 2
     * @param n an integer
     * @return a square matrix
     */
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int num=1;
        int rowS=0;
        int colS=0;
        int rowE=n-1;
        int colE=n-1;
        int i=0;
        while(rowS<=rowE&&colS<=colE){
            for(i=colS;i<=colE;i++){
                result[rowS][i]=num++;
            }
            rowS++;
            
            for(i=rowS;i<=rowE;i++){
                result[i][colE]=num++;
            }
            colE--;
            
            for(i=colE;i>=colS;i--){
                result[rowE][i]=num++;
            }
            rowE--;
            
            for(i=rowE;i>=rowS;i--){
                result[i][colS]=num++;
            }
            colS++;
        }
        
        return result;
    }
}
