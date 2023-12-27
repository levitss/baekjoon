class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index=0;
        for (int i=0;i<k;i++){
            
            answer=numbers[index%numbers.length];
            index+=2;
            
        }
        return answer;
    }
}