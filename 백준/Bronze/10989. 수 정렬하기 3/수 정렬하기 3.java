import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());//숫자
        int[]count=new int[10001]; //최대 10000
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++; //해당 수의 카운트 증가
        }
        br.close();
        StringBuffer sb = new StringBuffer();
        //1~10000
        for (int i = 1; i < 10001; i++) {
            //i값이 개수가 0이 될 때까지 출력
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
//1. list 정렬 -----메모리 초과
// 기수 정렬 시도---시간 초과
// 카운트 정렬 시도


    }
}
