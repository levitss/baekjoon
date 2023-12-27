import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String>list =new ArrayList();
        for(String a: my_string.split("")){
            list.add(a.toLowerCase());
        }
        Collections.sort(list);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}