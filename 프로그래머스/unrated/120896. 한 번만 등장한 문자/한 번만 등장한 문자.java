import java.util.*;
class Solution {
    public String solution(String s) {
        int arr[]=new int[26];
        for(char a:s.toCharArray()){
            arr[a-'a']+=1;
            
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<26;i++){
            if(arr[i]==1) sb.append((char)(i+'a'));
        }
        if(sb.length()==0) return "";
        
        return sb.toString();
    }
}