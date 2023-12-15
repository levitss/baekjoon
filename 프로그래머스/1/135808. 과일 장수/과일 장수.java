import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //가장 낮은 점수 * m ==박스 전체 가격
        //가장 높은 점수 ==k
        //sort 후 위에서 m개 제한
        List<Integer> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for(int a:score){
            list.add(a);
        }
        Collections.sort(list,(o1,o2)->{return o2-o1;});
        while(list.size()>=m){
            temp=list.subList(0,m);
            list=list.subList(m,list.size());
            answer+=temp.get(temp.size()-1)*m;
        }
        
        
        if(answer==0){
            return 0;
        }
        return answer;
    }
}
