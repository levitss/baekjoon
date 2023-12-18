import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        List<String> list=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
            if(a!=' ') sb.append(a);
            if(a==' ') {
                if(sb.length()!=0){
                    list.add(sb.toString());
                    sb.delete(0,sb.length());
                }
                continue;
            }
          
        }
           if(sb.length()!=0){
                    list.add(sb.toString());
                }
        return list.toArray(new String[list.size()]);
    }
}