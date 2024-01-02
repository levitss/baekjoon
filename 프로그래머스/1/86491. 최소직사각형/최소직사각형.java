import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        List<Integer> x=new ArrayList();
        List<Integer> y=new ArrayList();
        for(int[] a:sizes){
            x.add(a[0]>=a[1]?a[0]:a[1]);
            y.add(a[0]>=a[1]?a[1]:a[0]);
        }
        Collections.sort(x,Collections.reverseOrder());
        Collections.sort(y,Collections.reverseOrder());
        
        
        return x.get(0)*y.get(0);
    }
}