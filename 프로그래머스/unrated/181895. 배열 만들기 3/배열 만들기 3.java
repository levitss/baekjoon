import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list=new ArrayList<>();        
        int start= intervals[0][0];
        int end= intervals[0][1];
        
        for(int i=start;i<end+1;i++){
            list.add(arr[i]);
        }
        start= intervals[1][0];
        end= intervals[1][1];
        
        for(int i=start;i<end+1;i++){
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
        
    }
}