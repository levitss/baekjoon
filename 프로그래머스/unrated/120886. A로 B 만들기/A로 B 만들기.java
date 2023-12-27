import java.util.*;
class Solution {
    public int solution(String before, String after) {
        List<String> list1=new ArrayList();
        List<String> list2=new ArrayList();
        for(String a: before.split("")){
            list1.add(a);
        }
        for(String b: after.split("")){
            list2.add(b);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)) return 1;
        
        int answer = 0;
        return answer;
    }
}