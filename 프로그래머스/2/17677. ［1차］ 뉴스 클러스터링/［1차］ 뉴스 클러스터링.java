import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        
       double denom=0;
        double numer=0;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        Map<String,Integer>map1=new HashMap<>();
        Map<String,Integer>map2=new HashMap<>();
        String s1;
        String s2;
        for(int i=0;i<str1.length()-1;i++){
            if(Character.isAlphabetic(str1.charAt(i))&&Character.isAlphabetic(str1.charAt(i+1))){
                s1=str1.substring(i,i+2);
                map1.put(s1,map1.getOrDefault(s1,0)+1);
            }
        }
        for(int i=0;i<str2.length()-1;i++){
            if(Character.isAlphabetic(str2.charAt(i))&&Character.isAlphabetic(str2.charAt(i+1))){
                s2=str2.substring(i,i+2);
                map2.put(s2,map2.getOrDefault(s2,0)+1);
            }
        }
        List<String> list = new ArrayList<>();
        Set<String> set1=map1.keySet();
        Set<String> set2=map2.keySet();
        for(String strr1:set1){

            for(String strr2:set2){
                //교집합이 있으면
                if(strr1.equals(strr2)){
                    denom+=Math.min(map1.get(strr1),map2.get(strr2));
                    numer += Math.max(map1.get(strr1), map2.get(strr2));
                    list.add(strr1);
//                    set2.remove(strr2);
                    break;
                }
            }
        }
        set1.removeAll(list);
        set2.removeAll(list);
        for(String strr2:set2){
            list.add(strr2);
            numer += map2.get(strr2);

        }
        for(String strr1:set1){
            list.add(strr1);
            numer += map1.get(strr1);
        }
        if(denom==numer)return 65536;
        return (int) ((denom / numer) * 65536);
        
        
    }
}