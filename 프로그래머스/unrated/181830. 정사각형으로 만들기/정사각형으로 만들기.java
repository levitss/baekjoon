class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int col=arr[0].length;
        int row=arr.length;
        if(col==row) return arr;
        if(col>row){
            //
            answer=new int [col][col];
            System.arraycopy(arr,0,answer,0,arr.length);
        }
        if(col<row){
            answer=new int [row][row];
            for(int i=0;i<row;i++){
                int [] temp=new int [row];
                System.arraycopy(arr[i],0,temp,0,arr[i].length);
                answer[i]=temp;
            }
            
        }
        
        
        return answer;
    }
}