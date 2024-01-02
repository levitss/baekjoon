import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List <Integer> list=new ArrayList<>();
        int value=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)continue;
            value=arr[i];
            list.add(value);
            
        }
        
        
        

        return list.stream().mapToInt(i->i).toArray();
    }
}