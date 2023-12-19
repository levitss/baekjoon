
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.size()==k) break;
            int n=arr[i];
            if(list.contains(n)) {
                continue;
            }
            list.add(n);
        }
            
            
        
        if(list.size()<k) {
            for(int i=list.size();i<k;i++){
                    list.add(-1);
            }
                
        } 
                
        return list.stream().mapToInt(i->i).toArray();
    }
}