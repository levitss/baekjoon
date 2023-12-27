import java.util.*;
class Solution {
    public int solution(String my_string) {
        StringBuffer sb=new StringBuffer();
        int answer = 0;
        for(char a:my_string.toCharArray()){
            if(!Character.isAlphabetic(a)){
                sb.append(a-'0');
            }
            if(Character.isAlphabetic(a)){
                sb.append(" ");
            }
        }
        String aq=sb.toString().trim();
        StringTokenizer st=new StringTokenizer(aq," ");
        while(st.hasMoreTokens()){
            
            answer+=Integer.parseInt(st.nextToken());
        }
        
        
            
        
        return answer;
    }
}