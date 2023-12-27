class Solution {
    public String solution(int age) {
        String a=String.valueOf(age);
        StringBuffer sb=new StringBuffer();
        for(String c:a.split("")){
            
            sb.append(Character.toString(Integer.parseInt(c)+'a'));
            
        }
        String answer = "";
        return sb.toString();
    }
}