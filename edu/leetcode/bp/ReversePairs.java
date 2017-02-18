package edu.leetcode.bp;

public class ReversePairs {
	public long reversePairs(int[] A) {
        // Write your code here
        if(A == null || A.length == 0){
            return 0;
        }

        return mergeSort(A, 0, A.length - 1);
    }
    
    private long mergeSort(int[] A, int start,int end){
        
        if(start>=end){
            return 0;
        }
        long sum=0;
        int mid=(start+end)/2;
        sum+=mergeSort(A,start,mid);
        sum+=mergeSort(A,mid+1,end);
        sum+=merge(A,start,mid,end);
        
        return sum;
    }
    
    private long merge(int[] A, int start,int mid,int end){
        long sum=0;
        int[] temp=new int[A.length];
        int left=start;
        int right=mid+1;
        int index=start;
        while(left<=mid&&right<=end){
            if(A[left]<=A[right]){
                temp[index++]=A[left++];
            }else{
                temp[index++]=A[right++];
                sum += mid - left + 1;
            }
        }
        while(left<=mid){
            temp[index++]=A[left++];
        }
        while(right<=end){
            temp[index++]=A[right++];
        }
        
        for(int i=start;i<=end;i++){
            A[i]=temp[i];
        }
        
        return sum;
    }
}
