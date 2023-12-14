import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
       int[] answer = new int[score.length];
            //링크리스트?
            List<Integer> list=new LinkedList<>();
//
//            for(int i=0;i<k;i++){
//                list.add(score[i]);
//                Collections.sort(list,(o1,o2)->{return o2-o1;});
//                answer[i]=list.get(list.size()-1);
//            }
        list.add(score[0]);
        answer[0] = score[0];
        for (int i = 1; i < score.length; i++) {

            int target = list.get(list.size() - 1);
            if (list.size() == k && score[i] > target) {
                list.remove(list.size() - 1);
                list.add(score[i]);
            } else if (list.size() < k) {
                list.add(score[i]);
            }

            Collections.sort(list, (o1, o2) -> {
                return o2 - o1;
            });
            answer[i] = list.get(list.size() - 1);
        }

            return answer;
    }
}