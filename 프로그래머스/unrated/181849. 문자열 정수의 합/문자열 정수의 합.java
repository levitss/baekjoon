class Solution {
    public int solution(String num_str) {
        char arr[]=num_str.toCharArray();
        int sum=0;
        for(char a: arr){
            sum+=a-'0';
        }
        
        return sum;
    }
}