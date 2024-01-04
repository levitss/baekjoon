class Solution {
    public int[] solution(int brown, int yellow) {
       
         int[] answer = new int [2];
        int y=1;
        int temp=yellow+brown;
        int x;
        while(true){
            x=(brown-y*2)/2+2;
            if(x*y==temp){
                answer[1]=y;
                answer[0]=x;
                return answer;
            }
            y++;
        }
        
    }
}
    