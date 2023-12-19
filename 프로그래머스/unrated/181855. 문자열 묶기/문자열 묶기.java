import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(String a:strArr){
            map.put(a.length(),map.getOrDefault(a.length(),0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new LinkedList(map.entrySet());
        list.sort((o1,o2)->o2.getValue()-o1.getValue());
        return list.get(0).getValue();
    }
}