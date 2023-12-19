import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        //12, 4, 15, 46, 38, 1, 14, 56, 32, 10
        Arrays.sort(num_list);
        //1, 4, 10, 12, 14, || 15, 32, 38, 46, 56
        for(int i=0;i<answer.length;i++){
            answer[i]=num_list[i+5];
        }
        
        return answer;
    }
}