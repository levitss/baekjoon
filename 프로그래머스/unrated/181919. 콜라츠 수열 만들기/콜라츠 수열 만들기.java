import java.io.IOException;
import java.util.*;
class Solution {
      public int[] solution(int n) {

        //n이 짝수면 /2 , 홀수면 *3 +1
        List<Integer> list = new ArrayList<>();
        int temp = n;
        list.add(n);
        while (true) {
            if (n % 2 == 0&&n!=1) {
                n /= 2;
                list.add(n);
                continue;
            }
            if (n % 2 == 1&&n!=1) {
                n = n * 3 + 1;
                list.add(n);
                continue;
            }
            if (n == 1) {
                break;
            }

        }
        int[] ints = list.stream().mapToInt(i -> i).toArray();
        return ints;
    }
}