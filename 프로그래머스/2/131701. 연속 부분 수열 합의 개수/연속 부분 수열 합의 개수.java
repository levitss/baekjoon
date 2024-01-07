import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int value;
        Set<Integer> set=new HashSet<>();
        int n=1;
        int ln=elements.length;
        while(n<=ln){
            for(int i=0;i<ln;i++){
                value=0;
                for(int j=i;j<i+n;j++){
                    value+=elements[j%ln];
                }

                set.add(value);
            }
            n++;
            
        }
        return set.size();
    }
}