import java.util.*;class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int ln=phone_book.length;
        List<String> list=new ArrayList(Arrays.asList(phone_book));
        //짧은거부터 해서 비교?
        Collections.sort(list);
        for(int i=0;i<ln-1;i++){
            String str=list.get(i);
            
            String str2=list.get(i+1);
            if(str2.length()>str.length()&&str2.startsWith(str)){
                return false;
            }

            
        }
        return answer;
    }
}