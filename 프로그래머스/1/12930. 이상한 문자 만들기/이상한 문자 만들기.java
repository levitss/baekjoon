import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        //공백도 유지
        int index=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isAlphabetic(c)){
                if(index%2==0){
                    c=Character.toUpperCase(c);
                }
                if(index%2==1){
                    c=Character.toLowerCase(c);
                }
                index++;
            }else{
                index=0;
            }
            sb.append(c);
        }
        
        
        return sb.toString();
    }
}