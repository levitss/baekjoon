class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            char ch=my_string.charAt(i);
            //대문자일 경우
            if(Character.isUpperCase(ch)){
            answer[my_string.charAt(i)-'A']+=1;    
            }
            
            //소문자일 경우 -'a'+26
            if(Character.isLowerCase(ch)){
                answer[my_string.charAt(i)-'a'+26]+=1;    
            }
            
        }
        return answer;
    }
}