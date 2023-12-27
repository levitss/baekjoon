class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer=0;
        for(int a: array){
            int val=Math.abs(n-a);
            if(min>val) {
                answer=a;
                
                min=val;
            }else if(min==val){
                if(answer>a) answer=a;
                
            }
        }
        return answer;
    }
}