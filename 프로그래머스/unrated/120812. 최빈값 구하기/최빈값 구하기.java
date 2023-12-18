import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> map=new HashMap<>();
        
        
        
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        list.sort((o1,o2)->{
            return o2.getValue()-o1.getValue();
        });
        
        
        if(map.size()>1&&list.get(0).getValue()==list.get(1).getValue())return -1;
        return list.get(0).getKey();
    }
}