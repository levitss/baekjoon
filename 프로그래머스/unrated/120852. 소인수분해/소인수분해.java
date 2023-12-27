import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        int temp=n;
        List<Integer> list=new ArrayList();
        for(int i=2;i<=temp;i++){
            if(n%i==0){
                if(!list.contains(i)) list.add(i);
                n/=i;
                i--;
            }
        }
        Collections.sort(list);
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}