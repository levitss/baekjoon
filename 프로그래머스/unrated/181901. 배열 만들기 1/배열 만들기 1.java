import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List <Integer> list=new LinkedList<>();
        for(int i=k;i<=n;i++){
            if(i%k==0){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}