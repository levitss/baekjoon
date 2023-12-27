class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str:s1){
            for(String str1:s2){
                if(str.equals(str1))answer++;
            }
        }
        return answer;
    }
}