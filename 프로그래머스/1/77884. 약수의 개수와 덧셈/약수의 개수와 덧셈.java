class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            int sub=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0) {
                    sub+=2;
                    //제곱수면 -1
                    if(j*j==i) sub--;
                }         
                
                //100
                //1 100   2 50 4 25  5 20  10 10    
            }
            sub+=2;
            if(i==1) sub=1;
            if(sub%2==0) answer+=i;
            if(sub%2==1) answer-=i;
            
            
        }
        return answer;
    }
}
