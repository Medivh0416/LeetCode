package edu.leetcode.stringIntger;

public class _38CounrAndSay {
	public static void main(String[] args) {
		countAndSay(4);
	}
	public static String countAndSay(int n) {
        if(n<0){
            return "";
        }else if(n==1){
            return "1";
        }
        String s="11";
        StringBuilder sb=new StringBuilder();
        for(int j=3;j<=n;j++){
            char temp=s.charAt(0);
            int count=1;
            for(int i=1;i<s.length();i++){
                if(temp!=s.charAt(i)){
                    sb.append(count+""+temp);
                    count=1;
                    temp=s.charAt(i);
                }else{
                    count++;
                }
            }
            sb.append(count+""+temp);
            s=sb.toString();
            sb.replace(0,sb.length(),"");
        }
       return s;
    }
}
