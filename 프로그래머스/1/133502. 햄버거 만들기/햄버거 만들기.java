import java.io.IOException;
import java.util.*;class Solution {
    public int solution(int[] ingredient) {
       
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < ingredient.length; i++) {
            list.add(ingredient[i]);
        }
//list는 시간초과
        //string buffer 로 잘라서 비교해야
        int result = 0;
        StringBuffer sb = new StringBuffer();
        for (int a :
                ingredient) {
            sb.append(a);
            if (sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals("1231")) {
                result++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        return result;
    }
       
}