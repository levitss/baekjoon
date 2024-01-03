import java.math.*;
class Solution {
    public int solution(int n) {
        BigInteger init = new BigInteger("0");
        BigInteger value = new BigInteger("1");

        BigInteger temp = new BigInteger("0");

        long count=2;

        while(true){
            temp = value.add(init);
            init=value;
            value=temp;

            if(count==n)break;
            count++;
        }
        return temp.remainder(new BigInteger("1234567")).intValue();
        
        
    }
}