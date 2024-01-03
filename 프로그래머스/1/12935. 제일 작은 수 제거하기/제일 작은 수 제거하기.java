import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if(arr.length==1) return answer;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)min=arr[i];
        }
        final int v=min;
        return Arrays.stream(arr).filter(i->i>v).toArray();
        
    }
}