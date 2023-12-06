class Solution {
    public int solution(int a, int b) {
        int q=Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int w=Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        if(q>w) return q;
        if(q<w) return w;
        
        
        return q;
    }
}