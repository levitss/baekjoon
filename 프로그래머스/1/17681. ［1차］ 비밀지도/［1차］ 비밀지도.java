import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        List<String> binary1=new ArrayList<>();
        List<String> binary2=new ArrayList<>();
        List<String> answer=new ArrayList<>();
        StringBuilder sb;
        for(int i=0;i<arr1.length;i++){
            sb=new StringBuilder(Integer.toBinaryString(arr1[i]));
            while(sb.length()<n){
                sb.insert(0,0);
            }
            binary1.add(sb.toString());
        }
        for(int i=0;i<arr2.length;i++){
            sb=new StringBuilder(Integer.toBinaryString(arr2[i]));
            while(sb.length()<n){
                sb.insert(0,0);
            }
            binary2.add(sb.toString());
        }
        //맵 겹치기 1이 벽
        sb=new StringBuilder();

        for(int i=0;i<binary2.size();i++){
            
            String str1=binary1.get(i);
            String str2=binary2.get(i);
            for(int j=0;j<n;j++){
                if(str1.charAt(j)=='1'||str2.charAt(j)=='1'){
                    sb.append("#");                    
                    continue;
                }
                sb.append(" ");
            }
            answer.add(sb.toString());
            sb.delete(0,sb.length());
            
        }
        
        
        
        return answer.toArray(new String[answer.size()]);
    }
}