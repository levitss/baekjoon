class Solution {
    public int solution(int[][] board) {
         int answer=0;
        //지뢰 지도가 될 arr
        //초기화 0
        int[][] tempArr = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                   tempArr= check(i,j,tempArr);

                }
            }

        }
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr[i].length; j++) {
                if (tempArr[i][j] == 0) {
                    answer++;
                }
            }

        }


        return answer;
    }
     private int[][] check(int i,int j, int[][] tempArr) {
        int[] x = {-1,0,1,-1,0,1,-1,0,1};
        int[] y = {-1,-1,-1,0,0,0,1,1,1};
        //i는 y, j는 x
        for (int k = 0; k < x.length; k++) {
            int a = x[k] + j;
            int b = y[k] + i;
            if (( a>= 0 && b >= 0)) {
                if (a <=tempArr.length-1 && b <=tempArr[0].length-1) {
                    tempArr[b][a] = 1;

                }
            }


        }
        return tempArr;
    }
}