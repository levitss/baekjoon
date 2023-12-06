class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean flag=true;
        char in=ineq.charAt(0);
        char e=eq.charAt(0);
        if(in=='>'&&e=='=')
            flag= n>=m;
        if(in=='<'&&e=='=')
            flag= n<=m;
        if(in=='>'&&e=='!')
            flag= n>m;
        if(in=='<'&&e=='!')
            flag= n<m;
        
        if(flag) answer=1;
        return answer;
    }
}