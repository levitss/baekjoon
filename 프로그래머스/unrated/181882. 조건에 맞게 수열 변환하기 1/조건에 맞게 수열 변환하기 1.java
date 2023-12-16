import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        
        int i=0;
        for (int a:arr){
            if(a>=50&&a%2==0) answer[i]=a/2;
            
            if(a<50&&a%2!=0) answer[i]=a*2;
            
            
            i++;
            
        }
        return answer;
    }
}