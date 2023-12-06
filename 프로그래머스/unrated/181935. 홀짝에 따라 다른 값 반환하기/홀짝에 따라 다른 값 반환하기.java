class Solution {
    public int solution(int n) {
        int answer=0;
        //짝수
        if(n%2==0){
            //양의 정수의 제곱 합
            for(int i=0;i<=n;){
                answer+=Math.pow(i,2);
                            i+=2;

            }    
            return answer;
        }
        for(int i=1;i<=n;){
                answer+=i;
                i+=2;
            }    
        
        
            
            
        
        return answer;
    }
}