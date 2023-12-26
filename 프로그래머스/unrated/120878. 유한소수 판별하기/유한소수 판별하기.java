class Solution {
    public int solution(int a, int b) {
        int answer = 0;
              int gcd=0;
        while(gcd!=1){
            gcd=gcd(a,b);
            a/=gcd;
            b/=gcd;
        }
        if(b==1||b==2||b==5) return 1;
        for (int i=2;i<=b;i++){
            if(b%i==0){
                if(i==5||i==2) {
                    b/=i--;
                    continue;
                }
                return 2;
                
            }
        }
        //소수의 경우
        
        return 1;
    }
    
    
    int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    
    
}