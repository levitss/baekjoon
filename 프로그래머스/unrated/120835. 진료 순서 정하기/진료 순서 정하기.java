import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<emergency.length;i++){
            map.put(emergency[i],emergency[i]);
        }
        List<Map.Entry<Integer,Integer>> list=new LinkedList(map.entrySet());
        list.sort((i1,i2)->{
            return i2.getValue()-i1.getValue();
        });
        for(int i=0;i<list.size();i++){
            map.put(list.get(i).getKey(),i+1);
        }
        
        int[] answer = new int [emergency.length];
        for(int i=0;i<list.size();i++){
            answer[i]=map.get(emergency[i]);
        }
        
        return answer;
    }
}