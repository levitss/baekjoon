import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        Map<String,Integer> americano=new HashMap<>();
        americano.put("iceamericano",4500);
        americano.put("americano",4500);
        americano.put("americanoice",4500);
        americano.put("anything",4500);
        americano.put("hotamericano",4500);
        americano.put("americanohot",4500);

        Map<String,Integer> latte=new HashMap<>();
        latte.put("icecafelatte",5000);
        latte.put("cafelatteice",5000);
        latte.put("hotcafelatte",5000);
        latte.put("cafelattehot",5000);
        latte.put("cafelatte",5000);
        for(String str:order){
            if(americano.containsKey(str)) answer+=4500;
            if(latte.containsKey(str)) answer+=5000;
        }
        
        
        return answer;
    }
}