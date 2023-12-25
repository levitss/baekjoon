class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer sb=new StringBuffer();
        for(String a:str_list){
            if(a.contains(ex)) continue;
            sb.append(a);
        }
        
        return sb.toString();
    }
}