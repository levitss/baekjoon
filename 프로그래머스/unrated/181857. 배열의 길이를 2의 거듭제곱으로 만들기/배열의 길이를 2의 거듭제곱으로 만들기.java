class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for(int i=0;i<11;i++){
            int n=(int)Math.pow(2,i); //2의 제곱 1~10
            int len=arr.length;
            if(len<n){
                //길이가 작을 때
                answer=new int [n]; 
                for(int j=0;j<arr.length;j++){
                    answer[j]=arr[j];
                }
                return answer;
            }
            if(len==n){
                return arr;
            }
            
        }
        return answer;
    }
} 