
import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<score.length;i++){
            map.put(i,(score[i][0]+score[i][1]));
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((i1,i2)->{return i2.getValue()-i1.getValue();});
        //value 순으로 정렬 끝. 등수 매겨서 put해주기
        int temp=0;
        int skip=1;
        int rank=0;
        for(int i=0;i<list.size();i++){
            int value=list.get(i).getValue();
            //이전과 점수가 같으면 등수 유지
            if(value!=temp){
                rank+=skip;
                skip=1;
            }else{
                skip++;
            }
            temp=list.get(i).getValue();
            map.put(list.get(i).getKey(),rank);
            
            
            
        }
        
        
            
        
        return map.values().stream().mapToInt(i -> i).toArray();
    }
}