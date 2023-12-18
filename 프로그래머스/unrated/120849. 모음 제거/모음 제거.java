class Solution {
    public String solution(String my_string) {
        StringBuffer sb=new StringBuffer();
        for(char a:my_string.toCharArray()){
            if(a=='a'||a=='i'||a=='u'||a=='e'||a=='o') continue;
            sb.append(a);
        }
        
        return sb.toString();
    }
}