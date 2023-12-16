class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuffer sb=new StringBuffer(my_string);
        StringBuffer temp=new StringBuffer();
        for(int [] a:queries){
            
            int x= a[0];
            int y=a[1];
            temp.append(sb.substring(x,y+1));
            
            
            
            
            
            sb.replace(x,y+1,temp.reverse().toString());
            temp.delete(0,temp.length());
        
        }
        
        return sb.toString();
    }
}