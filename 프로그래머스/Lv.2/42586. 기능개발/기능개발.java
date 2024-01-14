import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        //나갈 순서, 진행도
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < speeds.length; i++) {
            map.put(i,progresses[i]);
        }
        int index = 0;
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        koko:while (index < speeds.length) {
            //phase1 진도 증가
            for (int j = index; j < speeds.length; j++) {
                map.put(j, map.get(j) + speeds[j]);
            }
            //phase2 진도 넘었는가 체크.
            for (int j = index; j < speeds.length; j++) {

                if (!(map.get(j) >= 100)) {
                    if (ans > 0) {
                        list.add(ans);
                        ans = 0;
                    }
                    continue koko;
                }else {
                    index++;
                    ans++;
                }


            }
        }
        list.add(ans);
                
        
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}