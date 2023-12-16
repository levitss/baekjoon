import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
          int answer = 0;
        Map<Integer,Integer> map=new HashMap<>();

        map.put(a,map.getOrDefault(a,0)+1);
        map.put(b,map.getOrDefault(b,0)+1);
        map.put(c,map.getOrDefault(c,0)+1);
        map.put(d,map.getOrDefault(d,0)+1);

        List<Map.Entry<Integer,Integer>>list=new LinkedList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
        list.sort(((o1, o2) -> {return o2.getValue()-o1.getValue();}));
        //굴려서 나온 횟수
        int aa=list.get(0).getValue();
        //다 같음
        if(aa==4) return 1111*list.get(0).getKey();

        int bb=list.get(1).getValue();
        //2개씩 같음
        if (aa == 2 && bb == 2) {
            return    (list.get(0).getKey()+list.get(1).getKey())*Math.abs(list.get(0).getKey()-list.get(1).getKey());
        }
        //3개 1개
        if(bb==1&&aa==3){
            return (int)Math.pow(10*list.get(0).getKey()+list.get(1).getKey(),2);
        }
        //2개 1개 1개
        if(aa==2&&bb==1){
            return list.get(2).getKey()*list.get(1).getKey();
        }
        //다 다름
        int dd=list.get(3).getValue();
        list.sort(((o1, o2) -> {return o2.getKey()-o1.getKey();}));

        if (dd == 1) {
            return list.get(3).getKey();
        }





        
        
        return answer;
    }
}