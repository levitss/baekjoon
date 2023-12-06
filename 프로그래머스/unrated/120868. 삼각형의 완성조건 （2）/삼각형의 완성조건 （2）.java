class Solution {
    public int solution(int[] sides) {
        int answer = 0;
                    // 가장 큰 값은 작은 것들의 합보다 작아야 한다.
        //그 갯수를 세는 문제..
        int a = sides[0];
        int b = sides[1];
        int max = Math.max(a, b);
        int min = Math.min(a, b);
          //a,b가 제일 길때
        answer += min;
        //c가 제일 길떄
        answer+=min-1;



        return answer;
    }
}