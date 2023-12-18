class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char a:my_string.toCharArray()){
            if(!Character.isLetter(a)){
                answer+=a-'0';
            }
        }
        return answer;
    }
}