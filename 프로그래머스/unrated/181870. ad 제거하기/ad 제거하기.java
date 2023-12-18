import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list=new ArrayList<>();
        t:for(String str:strArr){
            if(str.length()<2){
                list.add(str);
                continue;
            }
            for(int i=0;i<str.length()-1;i++){
                if(str.substring(i,2+i).equals("ad")){
                      continue t;
                }
            }
            list.add(str);
            
            
        }
        return list.toArray(new String[list.size()]);
    }
}