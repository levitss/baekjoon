import java.io.IOException;
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
   List<Integer> list = new ArrayList();
        start: for (int i = l; i <=r ; i++) {
            int tmp = i;
            int digit = (int)Math.log10(i) + 1;
            for (int j = 0; j < digit; j++) {
                //1의 자리만
                String str = String.valueOf(tmp);
                String substring=str.substring(str.length()-1);
                tmp /= 10;
                //0 이거나 5인 경우에는 패스
                if (substring.equals("5") || substring.equals("0")) {
                     continue;
                }
                   continue start;
            }

            list.add(i);

        }
        int size = list.size();
        if (size == 0) {
            int[] ints = new int[1];
            ints[0] = -1;
            return ints;
        }


        int[] ints = list.stream().mapToInt(i -> i).toArray();
        return ints;


    }

}