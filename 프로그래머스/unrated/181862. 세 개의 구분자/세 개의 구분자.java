import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st= new StringTokenizer(myStr,"abc");
        
        if(st.countTokens()==0){
            return new String[]{"EMPTY"};
        }
        String[] answer = new String[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            answer[i++]=st.nextToken();
        }
        return answer;
    }
}