import java.util.*;class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       //수업받는 수
        int answer = 0;
        Map<Integer,Integer> map=new HashMap();
        //예비가 있으면 true?

        for(int i=1;i<=n; i++){
            map.put(i,1);
        }


        for(int i:reserve){
            map.put(i,map.get(i)+1);
        }
        //여벌 있는 사람이 lost에도 있으면 제외
//        여벌 있는 사람이 타인에게 주는 경우는??
        for(int l:lost){
            map.put(l, map.get(l) - 1);

        }

        //value가 0일 때 주변에 2가 있는 경우
        for(int i=1;i<=map.size();i++){
            
            if (map.get(i) > 0) {
                answer++;
                continue;
            }
            if (map.containsKey(i - 1) && map.get(i - 1) == 2) {
                answer++;
                map.put(i - 1, map.get(i - 1) - 1);
                continue;
            }
            if (map.containsKey(i + 1) && map.get(i + 1) == 2) {
                answer++;
                map.put(i + 1, map.get(i + 1) - 1);
            }
        }
        
        return answer;
    }
}