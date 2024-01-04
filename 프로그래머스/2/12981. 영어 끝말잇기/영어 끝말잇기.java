import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        
        Set<String> set=new HashSet<>();
        int count=1;
        int countWords=1;
        set.add(words[0]);
        char temp=words[0].charAt(words[0].length()-1);
        String str="";
        for(int i=1;i<words.length;i++){
            count++;
            str=words[i];
            if(str.length()==1)return new int []{count,countWords};
            if(set.contains(str))return new int []{count,countWords};
            if(str.charAt(0)!=temp)return new int []{count,countWords};
            set.add(str);
            temp=str.charAt(str.length()-1);
            if(count==n){
                count=0;
                countWords++;
            }
        }
        return new int[]{0,0};
    }
}