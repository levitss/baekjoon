import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
            
        
        
        for(int i=0;i<query.length;i++){
            if(i%2==0){
                //뒷부분 자르기
                list=list.subList(0,query[i]+1);
                
            }
            else{
                list=list.subList(query[i],list.size());
            }
            
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}