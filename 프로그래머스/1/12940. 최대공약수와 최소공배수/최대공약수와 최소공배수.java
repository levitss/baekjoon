class Solution {
    public int[] solution(int n, int m) {
        int gcd=gcd(n,m);
        int[]answer={gcd,lcm(n,m,gcd)};
        return answer;
        
        
    }
    int gcd(int n,int m){
        
        if(m==0) return n;
        return gcd(m,n%m);
    }
    int lcm(int n,int m,int gcd){
        return (m*n)/gcd;
    }
    
    //(m*n)/gcd=lcm
}