class Solution {
    public int solution(int a, int b) {
        int q=Integer.parseInt( String.valueOf(a)+String.valueOf(b));
        int w=2*a*b;
        if(q>w)return q;
        return w;
    }
}