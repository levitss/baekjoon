class Solution {
    public String solution(String rny_string) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        for(char a:rny_string.toCharArray()){
            if(a=='m'){
                sb.append("rn");
                continue;
            }
            sb.append(a);
        }
        return sb.toString();
    }
}