class Solution {
    public int[] solution(int[] num_list) {
        int size=num_list.length;
        int end = num_list[size-1];
        int nd= num_list[size-2];
        int value=0;
        if(end>nd) value=end-nd;
        else value=end*2;
        
        
        int[] answer =new int [size+1];
        for (int i = 0; i <size; i++) {
            answer[i]=num_list[i];
        }
        answer[size]=value;
        return answer;
    }
}