import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
              int[] answer = new int[n];
        //원소의 합이 s
        //곱이 최대
        // 원소의 개수 n
        //존재하지 않을 때는 -1
        //n<=10000, 1<=s<=100,000,000

        int div = s / n;
        if (div == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
  Arrays.fill(answer, div);
        int rest = s % n;
        int index = 0;
        while (rest>0) {
            answer[index++%(n-1)] += 1;
            rest--;

        }


        Arrays.sort(answer);
        return answer;
    }
}