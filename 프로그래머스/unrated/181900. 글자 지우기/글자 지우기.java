import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuffer sb=new StringBuffer(my_string);
        //indices를 정렬시키고?
        Arrays.sort(indices);
        for(int i=indices.length-1;i>=0;i--){
            int index=indices[i];
            sb.replace(index,index+1,"");
        }
        return sb.toString();
    }
}