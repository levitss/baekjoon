class Solution {
    public int solution(int a, int b) {
        boolean isOddA=true;
        boolean isOddB=true;
        if(a%2==0) isOddA=false;
        if(b%2==0) isOddB=false;
        
        if(isOddA&&isOddB) return a*a+b*b;
        if(isOddA||isOddB) return (a+b)*2;
        return Math.abs(a-b);
        
        
    }
}