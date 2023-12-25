class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int index=0;    
        int start=-50;
        int sum=0;
        while(true){
            for(int i=0;i<num;i++){
                sum+=i+start;
            }
            if(sum==total){
                index=start;
                break;
            }
            sum=0;
            start++;
        }
        answer=new int [num];
        for(int i=0;i<num;i++){
            answer[i]=start++;
        }
        
    
        return answer;
    }
}