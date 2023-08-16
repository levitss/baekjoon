import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int spare = Integer.parseInt(st.nextToken());
        int[][] arr = new int[row][column];

        //평균값이 아니라 최소부터 최대 브루트포스
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < column; j++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[i][j] = temp;
                min = Math.min(min, temp);
                max = Math.max(max, temp);
            }
        }
        int Atime = Integer.MAX_VALUE;
        int Aheight = 0;
        for (int q = min; q <= max; q++) {
            //매시도마다 초기화
            int time = 0;
            int tempspare = spare;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    //기준 층과 현재 층의 차이
                    int diff = arr[i][j] - q;
                    if (diff > 0) {
                        //넘치니 제거
                        time += 2 * diff;
                        tempspare += diff;
                    } else if (diff < 0) {
                        //부족하면 채우기
                        time += Math.abs(diff);
                        tempspare -= Math.abs(diff);
                    }
                }
            }
            //계산 끝 판단
            if (tempspare >=0) {
                if (time <= Atime) {
                    Atime = time;
                    Aheight = q;
                }
            }
        }
        StringBuffer sb = new StringBuffer();







        sb.append(Atime).append(" ").append(Aheight);
        System.out.println(sb);

        //블럭 높이의 합 평균 반올림해서 부족하면 채우고 넘치면 회수
        //채우는데 1초 회수에 2초

    }

}
