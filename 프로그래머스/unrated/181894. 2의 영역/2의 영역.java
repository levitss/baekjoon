class Solution {
    public int[] solution(int[] arr) {
        //맨 처음 나오는 2~맨 마지막 나오는 2
        int start=0;
        int end=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
               start=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
               end=i;
                break;
            }
        }
        if(end-start==0){
            if(arr[start]!=2) return new int[]{-1};
        }
        int[] answer = new int[end-start+1];
        for(int i=start;i<end+1;i++){
            answer[i-start]=arr[i];
        }
        
        
        return answer;
    }
}