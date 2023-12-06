import java.util.*;import java.io.IOException;


class Solution {
    public int solution(String s) {
        StringTokenizer st=new StringTokenizer(s," ");
        
        int answer = 0;
        int n=st.countTokens();
        int temp=0;
        for(int i=0;i<n;i++){
            String str= st.nextToken();
            
            if (str.equals("Z")) {
                answer-=temp;
                continue;
            }
            int value=Integer.parseInt(str);
            answer+=value;
            temp=value;
            
            
        }
        return answer;
    }
}