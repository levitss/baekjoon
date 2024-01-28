class Solution {
    static int count=0;
    
    public int solution(int[] numbers, int target) {
  
        calc(0,target,numbers,0);
        
        return count;
    }
    void calc(int depth, int target,int[]numbers,int sum){
        int val=1;
        if(depth==numbers.length){
            if(sum==target){
                count++;
            }
            
        }else{
            calc(depth+1,target,numbers,sum+numbers[depth]);
            calc(depth+1,target,numbers,sum-numbers[depth]);
        }
        

    }
}