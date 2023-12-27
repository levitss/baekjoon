import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        
        int answer = 0;
        //5,3
        //2
        int n=balls-share;
        if(n==0) return 1;
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        //0,1
        for(int i=0;i<n;i++){
            
            a=a.multiply(BigInteger.valueOf(balls-i));
        }
        for(int i=1;i<=balls-share;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        
        return a.divide(b).intValue();
    }
}