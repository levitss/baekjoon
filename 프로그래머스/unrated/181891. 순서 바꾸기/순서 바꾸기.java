import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int temp=0;
        List <Integer> list=new LinkedList<>();
        for (int i =0; i <num_list.length ; i++) {
            
            if(i>=n){
                list.add(temp,num_list[i]);
                temp++;
            }else{
                list.add(num_list[i]);
            }
            
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}