class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int height = board.length;
        int width = board[0].length;
        //아래 위, 오른쪽, 왼쪽 확인
        int[] arrW = {0,0,1,-1};
        int[] arrH = {1,-1,0,0};
        for (int i = 0; i < arrW.length; i++) {
            int aW = arrW[i];
            int aH = arrH[i];
            int targetH = h + aH;
            int targetW = w + aW;
            if (targetH >= height || targetW >=width||targetH < 0 || targetW < 0) {
                continue;
            }
            if (board[h][w].equals(board[targetH][targetW])) {

                answer++;
            }

        }

        return answer;
    }
}