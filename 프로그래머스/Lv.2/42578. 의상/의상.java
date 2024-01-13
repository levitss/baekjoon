import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        if(map.size()==1)return clothes.length;
        int answer=1;
        int[] ints = map.values().stream().mapToInt(i -> i).toArray();
        for(int i=0;i<ints.length;i++){
            answer*=ints[i]+1;
        }
        return answer-1;
    }
}


