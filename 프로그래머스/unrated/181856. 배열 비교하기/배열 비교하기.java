import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1=arr1.length;
        int len2=arr2.length;
        if(len1!=len2) {
            answer=len1>len2? 1:-1;
            return answer;
        }
        
        int sum1=Arrays.stream(arr1).reduce(0,(a,b)->a+b);
        int sum2=Arrays.stream(arr2).reduce(0,(a,b)->a+b);
        if(sum1==sum2) return 0;
        answer=sum1>sum2?1:-1;
        
        
        return answer;
    }
}