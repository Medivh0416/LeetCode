package edu.uic.xuchu;

public class ImplementstrStr {
	
	public static void main(String[] args) {
		int i =strStr("asddsadsadsa","bbbbb");
		System.out.println(i);
	}

	/**
	 * EASY
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
    public static int strStr(String haystack, String needle) {
        if(haystack==null){
            return -1;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int j = 0;
            for(j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(j+i)){
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }



}
