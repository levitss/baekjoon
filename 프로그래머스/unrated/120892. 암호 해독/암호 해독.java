class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<cipher.length();i++){
            if((i+1)%code==0)sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}