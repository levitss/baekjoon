class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        //소수의 조건?
        //에라스토테네스의 체? 3000개..
        
        boolean [] arr= new boolean[3000];
            //자기 제외 배수면 제외
            //트루면 소수 아님
        for(int i=2;i<3000;i++){
            int index=2;
            while(index*i<3000){
                arr[index++*i]=true;
            }
        }
        //모든 사례를 직접 더해서 구해보기?
        int ln=nums.length;
        for(int i=0;i<ln;i++){
            for(int o=i+1;o<ln;o++){
                
                for(int p=o+1;p<ln;p++){
                    if(!arr[nums[i]+nums[o]+nums[p]]) answer++;
                }
            }
        }
        return answer;
    }
}