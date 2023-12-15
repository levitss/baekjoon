import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int t=arr[i];
            if(list.size()==0) {
                list.add(t);
                i++;continue;
            }
            if(list.get(list.size()-1)<t){
                list.add(t);
                i++;continue;
            }
            if(list.get(list.size()-1)>=t){
                list.remove(list.size()-1);
            }
            
            
        }
        return list.stream().mapToInt(a->a).toArray();
            
        
    }
}