import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0)return cities.length*5;
        //도시명, 빈도수
        Map<String,Integer> map=new HashMap<>();
        
        for(int i=0;i<cities.length;i++){
            String str= cities[i];
            str=str.toLowerCase();
            
            if(!map.containsKey(str)){
                answer+=5;                                
            }else {                
                answer+=1;
            }
            if(map.size()<cacheSize){
                map.put(str,i);                
            }else{
                //value는 시간 
                //key가 없다면 value가 가장 작은 값을 지우고 
                //key가 있다면 value 갱신
                if(map.containsKey(str)){
                    map.put(str,i);
                }else{
                    String target=Collections.min(map.entrySet(),(i1,i2)->{
                        return i1.getValue()-i2.getValue();
                    }).getKey();
                    map.remove(target);
                    map.put(str,i);
                }
            }
            
            
            
        }
        return answer;
    }
}