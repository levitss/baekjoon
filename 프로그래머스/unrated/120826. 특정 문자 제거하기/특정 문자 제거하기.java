import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb=new StringBuffer();
        String answer = "";
        char le=letter.charAt(0);
        for(char a:my_string.toCharArray()){
            if(a==le) continue;
            sb.append(a);
        }
        return sb.toString();
    }
}