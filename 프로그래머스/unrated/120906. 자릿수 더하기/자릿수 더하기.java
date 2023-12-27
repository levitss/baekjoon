class Solution {
    public int solution(int n) {
        int digt=(int)Math.log10(n)+1;
        int answer = 0;
        for(int i=1;i<=digt;i++){
            
            answer+=n%10;
            n/=10;
            
        }
        
        return answer;
    }
}