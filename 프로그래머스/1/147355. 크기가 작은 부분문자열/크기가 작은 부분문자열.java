class Solution {
    public int solution(String t, String p) {
int answer = 0;
        for (int i = 0; i < t.length()-p.length()+1; i++) {
                       long target = Long.parseLong(t.substring(i, i + p.length()));
            if (target <= Long.parseLong(p)) {
                answer++;
            }


        }
        return answer;    }
}