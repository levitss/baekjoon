class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp=0;
        for(int j=1;j<=n;j++){
            for(int i=1;i*i<=j;i++){
                if(j%i==0){
                    temp++;
                }
            }  
            //제곱수
            if(temp>=2) answer++;
            temp=0;

        }
        return answer;
    }
}