import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList();
        for(int a:delete_list){
            set.add(a);
            
        }
        
        for(int a:arr){
            if(set.contains(a)) continue;
            list.add(a);
            
        }
        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}