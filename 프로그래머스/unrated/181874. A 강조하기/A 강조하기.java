class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        char[] charr=myString.toCharArray();
        for(char a: charr){
            //a일땐 A로
            if(a-'a'==0) {
                sb.append(Character.toUpperCase(a)); 
                continue;
            }   
            //대문자는 소문자로
            
            if(Character.isUpperCase(a)&&a-'A'!=0){
                sb.append(Character.toLowerCase(a));
                continue;
 
            }
            //소문자는 그대로 
            sb.append(a);
           
        }
        
        return sb.toString();
    }
}
