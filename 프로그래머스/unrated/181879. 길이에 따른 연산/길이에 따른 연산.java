import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length=num_list.length;
        if(length>10){
            answer=Arrays.stream(num_list).sum();
        }
        else{
            answer=Arrays.stream(num_list).reduce(1,(a,b)->a*b);
        }
        return answer;
    }
}