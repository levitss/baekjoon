import java.io.IOException;
import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        //앞에 같은 글자가 없으면 -1
        //가장 가까운 곳. map 업데이트
        //char, index
        Map<Character,Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, i);
                list.add(-1);
                continue;
            }

            Integer index = map.get(c);
            map.put(c, i);
            list.add(i-index);
        }
        answer=list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}