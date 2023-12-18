class Solution {
    public String solution(String my_string, String alp) {
        char[] charr=my_string.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(char a:charr){
            if(a==alp.charAt(0)){
                a=Character.toUpperCase(a);
            }
            sb.append(a);
        }
        
        return sb.toString();
    }
}