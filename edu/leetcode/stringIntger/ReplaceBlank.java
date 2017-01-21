package edu.leetcode.stringIntger;

public class ReplaceBlank {

    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        if(string == null || string.length == 0){
            return 0;
        }
        int oldLength=length;
        for(int i=0;i<string.length;i++){
            if(string[i]==' '){
                length+=2;
            }
        }
        if(length==oldLength){
            return length;
        }
        int result=length;
        length--;
        for(int i=oldLength-1;i>=0;i--){
            if(string[i]==' '){
                string[length--]='0';
                string[length--]='2';
                string[length--]='%';
            }else{
                string[length--]=string[i];
            }
        }
        return result;
    }
}
