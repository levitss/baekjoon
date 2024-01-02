import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //다 더한 다음에 budget에 맞을 때 까지 제일 큰 수를 빼기?
        Arrays.sort(d);
        int sum=Arrays.stream(d).reduce(Integer::sum).getAsInt();
        int index=d.length-1;
        while(sum>budget){
            sum-=d[index--];
            
        }
            
        return index+1;
    }
}