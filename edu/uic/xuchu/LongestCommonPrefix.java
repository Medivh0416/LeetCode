package edu.uic.xuchu;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs=new String[]{"abd123","abd321"};
		System.out.println(longestCommonPrefix(strs));
	}
	/**
	 * Easy
	 * 1.Find the shortest String in the arrays
	 * 2.set a temp char to save the compare element
	 * 3.compare to every character in the arrays
	 * 4.define two for loop, one is determine the char,another is determine the string
	 * 5.if not find a different element, then append this char to StringBuilder
	 * 6.Once a different element found, return StringBuilder
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str;
        int minLength=strs[0].length();
        for(int i=0;i<strs.length;i++){
            str=strs[i];
            if(str.length()<minLength){
                minLength=str.length();
            }
        }
        StringBuilder sb=new StringBuilder();
        char ch;
        for(int i=0;i<minLength;i++){
            ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch)
                {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
	
}
