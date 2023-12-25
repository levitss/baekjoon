class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        //1. 판별
        if(common[1]-common[0]==common[2]-common[1]){
            return common[common.length-1]+common[2]-common[1];
            
            
        }
        if(common[1]/common[0]==common[2]/common[1]){
            return common[common.length-1]*(common[2]/common[1]);
            
        }
        return 0;
        
    }
}