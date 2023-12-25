class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int direction =0;
        int max_x=n;
        int max_y=n;
        int min_x=0;
        int min_y=1;
        int index_x=0;
        int index_y=0;
        int value=1;
        int temp=n;
        for(int i=0;i<n*n;i++){
            switch(direction){
                //->
                case 0:
                    if(index_x<max_x){
                        answer[index_y][index_x++]=value++;
                    }else{
                        direction++;
                        index_y++;
                        i--;
                        max_x--;
                        index_x--;
                    }
                    break;
                case 1:
                    if(index_y<max_y){
                        answer[index_y++][index_x]=value++;
                    }else{
                        direction++;
                        index_x--;
                        i--;
                        max_y--;
                        index_y--;
                    }
                    break;
                case 2:
                    if(index_x>=min_x){
                        answer[index_y][index_x--]=value++;
                    }else{
                        direction++;
                        index_y--;
                        i--;
                        min_x++;
                        index_x++;
                    }
                    break;
                case 3:
                    if(index_y>=min_y){
                        answer[index_y--][index_x]=value++;
                    }else{
                        direction=0;
                        index_x++;
                        i--;
                        min_y++;
                        index_y++;
                    }
                    break;
            }

        }
        
        return answer;
    }
}