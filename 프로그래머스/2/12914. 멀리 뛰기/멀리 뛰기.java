import java.math.*;
class Solution {
    public long solution(int n) {
        long answer = 1;
        if(n<=3) return n;
         // BigInteger a=BigInteger.ONE;
         // BigInteger b=BigInteger.ONE;
         // BigInteger temp=BigInteger.valueOf(0);
         long a=1;
        long b=1;
        long temp=0;
        for (int i = 2; i <= n; i++) {
            temp=(a+b)%1234567;
            a=b;
            b=temp;
        }
        return temp;
        
    }
    
    long calc(int a,int b){
        double value=1;
        for(int i=a;i>b;i--)  {
            value*=i;
        }
        for(int i=2;i<=a-b;i++)  {
            value/=i;
        }
        return (long)value;
    }
    
}