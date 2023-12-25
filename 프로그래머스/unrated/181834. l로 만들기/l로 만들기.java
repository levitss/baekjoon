class Solution {
    public String solution(String myString) {
        StringBuffer sb=new StringBuffer();
        
        
        for(char a:myString.toCharArray()){
            if(a-'l'<0) {
                sb.append("l");
                continue;
            }
            sb.append(a);
            
        }
        
        return sb.toString();
    }
}