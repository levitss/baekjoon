import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<numlist.length;i++){
            map.put(numlist[i],Math.abs(n-numlist[i]));
        }
        //차이 기준으로 정렬
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        list.sort((i1,i2)->{
            if(i1.getValue().equals(i2.getValue())){
                return i2.getKey()-i1.getKey();
            }
            return i1.getValue()-i2.getValue();
        });
        int[] answer = new int[numlist.length];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i).getKey();
        }
        return answer;
    }
}