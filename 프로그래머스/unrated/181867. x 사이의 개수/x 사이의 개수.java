import java.util.*;
class Solution {
    public int[] solution(String myString) {
           List <Integer> list=new ArrayList<>();

        int length=0;
        for(int i=0;i<myString.length();i++){
            char a=myString.charAt(i);

            if(a=='x'){
                list.add(length);
                length=0;
                continue;
            }
            length++;
        }
        list.add(length
        );
        return list.stream().mapToInt(i->i).toArray();
        
        
    }
}