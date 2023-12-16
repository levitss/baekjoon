class Solution {
    public String solution(String my_string, int m, int c) {
 StringBuffer sb=new StringBuffer();
        int temp=my_string.length();
        
        for(int i=0;i<temp;i++){
            if(my_string.length()<=m) {
                sb.append(my_string.charAt(c-1));
                break;
            }
            sb.append(my_string.substring(0,m+1).charAt(c-1));
            my_string=my_string.substring(m,my_string.length());
        }
        return sb.toString();
    }
}