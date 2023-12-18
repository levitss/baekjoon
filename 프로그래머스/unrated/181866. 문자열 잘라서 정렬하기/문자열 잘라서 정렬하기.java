import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        StringTokenizer st=new StringTokenizer(myString,"x");
        answer=new String[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            answer[i++]=st.nextToken();
        }
        Arrays.sort(answer);
        return answer;
    }
}