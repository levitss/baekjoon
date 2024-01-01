class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        //월
        //1월은 b만 존재
        // int months[]={31,29,31,30,31,30,31,31,30,31,30,31};
        // int months[]={3,1,3,2,3,2,3,3,2,3,2,3};
         int months[]={0,0,3,4,0,2,5,0,3,6,1,4,6};
        
        //a-1 까지의 sum
        int days=b+months[a];
        // for(int i=0;i<a-1;i++){
        //     days+=months[i];
        // }
        
        
        answer=day[days%7];
        
        
        return answer;
    }
}