class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        for(char a: myString.toCharArray()){
            sb.append(Character.toLowerCase(a));
        }
        return sb.toString();
    }
}