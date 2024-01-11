import java.util.*;
    class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i=0;i<citations.length;i++){
            final int value=i;
            long count=Arrays.stream(citations).filter(z->z>value).count();
            if(count>i){
                if(answer<i+1) answer=i+1;
            }
        }
        return answer;
    }
}