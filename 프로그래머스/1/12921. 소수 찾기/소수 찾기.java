class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean [] arr= new boolean[n+1];
            //자기 제외 배수면 제외
            //트루면 소수 아님
        for(int i=2;i<=n;i++){
            int index=2;
            while(index*i<=n){
                arr[index++*i]=true;
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]) answer++;
        }

        return answer;
    }
}