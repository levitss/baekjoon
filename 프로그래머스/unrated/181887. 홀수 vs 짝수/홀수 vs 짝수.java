class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_odd=0;int sum_even=0;
        
        for (int k = 0; k <num_list.length ; k++) {
            int num=k+1;       
            
            if(num%2==0){
                sum_even+=num_list[k];
            }
            if(num%2==1){
                sum_odd+=num_list[k];
            }
        }
        
        if (sum_even>sum_odd) return sum_even;
        return sum_odd;
        
    }
}