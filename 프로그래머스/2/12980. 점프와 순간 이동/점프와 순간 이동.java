import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        //n은 거리
        //1칸 전진 시 짝수
        //1, *2*2*2~~  1  2  4  8
        //2, *2 *2 *2  2  4  8  16
        //3 *2         3  6  12  24
        //짝수일 경우 
                //1               1     1    1     1   
 //2500 1250 625 624 312 156 78 39 38 19 18 9 8 4 2 1
        
        
        while(n>0){
            
            if(n%2==0) n/=2;
            if(n%2==1) {
                ans++;
                n=(n-1)/2;
            }
        }
        
        
        return ans;
    }
}