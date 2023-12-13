import java.io.IOException;
import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
 int answer = 0;
        //칠해야 하는 곳이 section
        //n은 최대 길이
        //m은 매 회 길이
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        for (int i = 0; i < section.length; i++) {
            arr[section[i]-1] = false;
        }
        int i = 0;
        ss: while (true) {
            if (!arr[i]) {
                for (int j = 0; j < m; j++) {
                    if(i+j>arr.length-1) break;
                    arr[i + j] = true;
                }
                answer++;

            }
            for (int j = i; j < arr.length; j++) {
                if (!arr[j]) {
                    i++;
                    continue ss;
                }
            }
            break;

        }

        return answer;
    }
}