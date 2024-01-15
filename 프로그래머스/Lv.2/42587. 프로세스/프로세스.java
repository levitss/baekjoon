import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
         Queue<Map.Entry<Integer, Integer>> que = new LinkedList<>();
Queue<Map.Entry<Integer, Integer>> priQue = new PriorityQueue<>((i1,i2)->{
            return i2.getValue() - i1.getValue();
        });
        for (int i = 0; i < priorities.length; i++) {
            que.add(new AbstractMap.SimpleEntry<Integer,Integer>(i,priorities[i]));
            priQue.add(new AbstractMap.SimpleEntry<Integer,Integer>(i,priorities[i]));
        }
        while (true) {
            Map.Entry<Integer, Integer> poll = que.poll();
            Map.Entry<Integer, Integer> poll1 = priQue.poll();
            int compare = poll1.getValue();
            int value = poll.getValue();
            if (value == compare) {
                answer++;
                if (poll.getKey() == location) {
                    break;
                }

            } else {
                que.add(poll);
                priQue.add(poll1);
            }
        }
        
        return answer;
    }
}