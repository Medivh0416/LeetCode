package edu.leetcode.array;

public class zigzag {
	
	/**
	 * Easy
	 * 1.Find the relation of each column
	 * 2.First Row and last row 2*i-2
	 * 3.Others i+2*i-2
	 * 4.do while index<s.length()
	 * 5.Append each char to StringBuilder
	 * @param s Input String
	 * @param numRows number of rows
	 * @return
	 */
    public String convert(String s, int numRows) {
        if(s==null||numRows<1){
            return null;
        }
        if(numRows==1||s.length()==1){
            return s;
        }
        int interval=2*numRows-2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=interval){
                sb.append(s.charAt(j));
                if(i!=0&&i!=numRows-1){
                    int indexIn=j+interval-2*i;
                    if(indexIn<s.length()){
                        sb.append(s.charAt(indexIn));
                    }
                }
            }
        }
        return sb.toString();
    }
}
