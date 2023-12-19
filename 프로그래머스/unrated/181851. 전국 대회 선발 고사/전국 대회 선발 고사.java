import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        //등수와 순번
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<rank.length;i++){
            
            if(attendance[i]) map.put(rank[i],i);
        }
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        list.sort((i1,i2)->i1.getKey()-i2.getKey());
        int a=list.get(0).getValue();
        int b=list.get(1).getValue();
        int c=list.get(2).getValue();
        
        return  10000*a+100*b+c;
        
    }
}