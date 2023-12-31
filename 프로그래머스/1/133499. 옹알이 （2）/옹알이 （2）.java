import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> set=new HashSet<>();
        set.add("aya");
        set.add("ye");
        set.add("woo"); 
        set.add("ma");
        String[] arr={ "aya", "ye", "woo", "ma"};
        //처음부분 부터 검사? 하드코딩
        //중복은 금지..연속해서 같은 발음을 하는 것을 어려워합니다
        for(String str:babbling){
            StringBuilder sb=new StringBuilder(str);
            //이전에 지운 str 저장
            
            String temp="";
            String target="";
            while(true){
                if(sb.length()>=3&&set.contains(sb.substring(0,3))){
                    target=sb.substring(0,3);
                    if(target.equals(temp)){
                        break;
                    }
                    
                    temp=target;
                    sb=sb.delete(0,3);
                    
                    continue;
                }
                if(sb.length()>=2&&set.contains(sb.substring(0,2))){
                    target=sb.substring(0,2);
                    if(target.equals(temp)){
                        break;
                    }
                    
                    temp=target;
                    sb=sb.delete(0,2);
                    continue;
                }
                if(sb.length()==0) answer++;
                
                break;
                
                
                
            }
        }
        return answer;
    }
}