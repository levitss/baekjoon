class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        sb.append(my_string.substring(s,e+1));
        StringBuffer temp=sb.reverse();
        sb=new StringBuffer(my_string);
        
        
        return sb.replace(s,e+1,temp.toString()).toString();
    }
}