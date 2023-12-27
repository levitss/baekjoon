import java.util.stream.Collectors;

import java.util.*;
class Solution {
    public int solution(int[] sides) {
        List<Integer>list=Arrays.stream(sides).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int max=list.get(2);
        int a=list.get(1);
        int b=list.get(0);
        if(max>=a+b)return 2;
        
        return 1;
    }
}