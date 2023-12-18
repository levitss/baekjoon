class Solution {
    public int solution(int n) {
        int f=1;
        if(n==0)return 0;
        for(int i=1;i<=n;i++){
            f*=i;
            if(f>n) return i-1;
        }
        return n;
    }
}