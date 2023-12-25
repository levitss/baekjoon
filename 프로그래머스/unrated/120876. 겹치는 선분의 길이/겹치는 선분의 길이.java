import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer=0;
        
        int arr[]=new int[201];
        for(int i=lines[0][0];i<lines[0][1];i++){
            arr[i+100]=1;
        }
        for(int i=lines[1][0];i<lines[1][1];i++){
            
            arr[i+100]+=1;
        }
        for(int i=lines[2][0];i<lines[2][1];i++){
            
            arr[i+100]+=1;
        }
        for(int a:arr){
            
            if(a==3||a==2)answer++;
        }
        
        return answer;
    }
}
