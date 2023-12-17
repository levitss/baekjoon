import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int [] temp;
        
        while(true){
            temp=Arrays.copyOf(arr,arr.length);
            
            for(int i=0;i<arr.length;i++){
                int value=arr[i];
                if(value>=50&&value%2==0){
                
                    arr[i]=value/2;
                }
                else if(value<50&&value%2==1){
                    arr[i]=value*2+1;
                }
            
            }
            
            if(Arrays.equals(temp,arr)){
                return answer;
            } 
            answer++;
            
        }
    }
}