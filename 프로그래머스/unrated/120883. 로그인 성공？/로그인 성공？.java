import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String,String> map=new HashMap();
        for(String[] str:db){
            map.put(str[0],str[1]);
        }
        String id=id_pw[0];
        String pw=id_pw[1];
        
        if(map.containsKey(id)){
            if(map.get(id).equals(pw)){
                return "login";
            }
            return "wrong pw";
        }else{
            return "fail";
        }
        
    }
}