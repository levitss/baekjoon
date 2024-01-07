import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list,(i1,i2)->{
           return i2.getValue()-i1.getValue();
        });
        int index=0;
        while(k>0){
            k-=list.get(index++).getValue();
            
            answer++;
            
        }
        
        return answer;
    }
    
    
//  개수 기준 정렬
}