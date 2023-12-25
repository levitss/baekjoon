import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*2];
        StringBuffer sb=new StringBuffer();
        List<String> list=new ArrayList<>();
        for(String str:picture){
            sb.delete(0,sb.length());
            //str을k배
            char[] cArr=str.toCharArray();
            
            for(char c: cArr){
                for(int i=0;i<k;i++){
                    sb.append(c);
                }
            }
            
            //k번반복
            for(int i=0;i<k;i++){
                list.add(sb.toString());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}