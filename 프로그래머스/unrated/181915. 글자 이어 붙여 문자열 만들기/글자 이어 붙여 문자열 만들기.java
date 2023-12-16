class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        for(int a:index_list){
            sb.append(my_string.charAt(a));
        }
        
        return sb.toString();
    }
}