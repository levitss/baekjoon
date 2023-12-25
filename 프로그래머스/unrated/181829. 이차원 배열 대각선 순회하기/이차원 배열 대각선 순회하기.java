class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int i=0;
        int j=0;
        for(int q=0;q<board.length;q++){
            for(int w=0;w<board[0].length;w++){
                if(q+w>k) break;
                answer+=board[q][w];
            }
        }
        return answer;
    }
}