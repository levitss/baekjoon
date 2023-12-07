class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuffer odd= new StringBuffer();
        StringBuffer even= new StringBuffer();
        for(int i=0;i<num_list.length;i++){
            int v=num_list[i];            
            if(v % 2==0){
                even.append(String.valueOf(v));
            }
            else{
                odd.append(String.valueOf(v));
            }
        }
        
        
        
        return Integer.parseInt(even.toString())+Integer.parseInt(odd.toString());
    }
}
