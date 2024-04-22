class Solution {
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int [queries.length];
        int[][] arr=makeArr(rows,columns);
        for(int i=0;i<queries.length;i++){
            answer[i]=rotate(arr,queries[i]);
        }
        return answer;
    }
    
    public int rotate(int[][]arr,int [] array){
        int low=Integer.MAX_VALUE;
        int temp=0;
        int x1=array[1]-1;
        int y1=array[0]-1;
        int x2=array[3]-1;
        int y2=array[2]-1;
        //2,2 5,4
        temp=arr[y1][x2]; 
            if(temp<low)low=temp;
        //위 가로
        for(int j=x2;j>x1;j--){
            arr[y1][j]=arr[y1][j-1];
            if(arr[y1][j]<low)low=arr[y1][j];
        }
        //왼 세로
        for(int j=y1;j<y2;j++){
            arr[j][x1]=arr[j+1][x1];
            if(arr[j][x1]<low)low=arr[j][x1];
        }
        //아래 가로
        for(int j=x1;j<x2;j++){
            arr[y2][j]=arr[y2][j+1];
            if(arr[y2][j]<low)low=arr[y2][j];
        }
        //오른 세로
        for(int j=y2;j>y1;j--){
            arr[j][x2]=arr[j-1][x2];
            if(arr[j][x2]<low)low=arr[j][x2];
        }
        arr[y1+1][x2]=temp;
        return low;
    }
    
    
    
    
    
    public int[][] makeArr(int rows,int columns){
        int[][] arr=new int [rows][columns];
        int number=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=number++;
            }
        }
        return arr;
    }
}