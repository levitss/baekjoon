import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp=n;
        for(int i=0;i<Math.log10(temp)+1;i++){
            answer+=n%10;
            n/=10;
        }
        return answer;
    }
}