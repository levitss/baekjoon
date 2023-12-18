import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List <Integer> list=new ArrayList();
        for(char a:my_string.toCharArray()){
            if(!Character.isLetter(a)){
                list.add(a-'0');
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}