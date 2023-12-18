class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        for(char a: my_string.toCharArray()){
            for(int i=0;i<n;i++){
                sb.append(a);
            }
        }
        return sb.toString();
    }
}