import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static int find(String[] inputBoard,int inputRow,int inputCol) {
        String [] originBoard={"WBWBWBWB","BWBWBWBW"};//비교용 대상
        int paintCount=0;
        for (int i = 0; i < 8; i++) {
            int row = inputRow + i;//원본 체스판에서 시작점
            for (int j = 0; j < 8; j++) {
                int col = inputCol + j;
                if (inputBoard[row].charAt(col) !=originBoard[row%2].charAt(j)) {//입력된 보드의 특정 시작점과 답을 비교
                    //다르면 페인트칠
                    paintCount++;
                }
            }
        }
        return Math.min(paintCount,64-paintCount) ;//시작이 W인 경우와 B인 경우
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int min=Integer.MAX_VALUE;

        String input[] = new String[row];
        for (int i = 0; i < row; i++) {//값 입력
            input[i] = br.readLine();
        }


        for (int i = 0; i <= row - 8; i++) {//큰 판에서 8칸 떼어내기
            for (int j = 0; j <= col-8; j++) {
                int temp= find(input,i,j);
                if (min > temp) {//매 경우의 수에 따른 min 비교
                    min=temp;
                }
            }
        }
        System.out.println(min);
    }
}



