class Solution {
    public int solution(int[] dot) {
        boolean x=true;
        boolean y=true;
        if(dot[0]<0) x=false;
        if(dot[1]<0) y=false;
        if(x&y) return 1;
        if(x&!y) return 4;
        if(!x&y) return 2;
        if(!x&!y) return 3;
        
        return 0;
        
    }
}