import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
//-100000~100000
    //n은 1~100000
    //y기준 정렬 후 x기준 정렬해야 함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());//x
            arr[i][1] = Integer.parseInt(st.nextToken());//y
        }
        sort(arr);



        StringBuilder sb = new StringBuilder();



        for (int i=0; i < n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
public static int[][]temp;
    public static void sort(int[][] arr) {
        temp = new int[arr.length][2];
        sort(arr, 0, arr.length - 1);
        temp = null;
    }

    public static void sort(int[][] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid,end);
    }

    private static void merge(int[][] arr, int start,int mid,int end) {
        int s = start;
        int e = mid + 1;
        int idx = start;
        while (s <= mid && e <= end) {
            if (arr[s][1] < arr[e][1]) {   //y가 작으면 작은거 정리
                temp[idx] = arr[s];
                idx++;
                s++;
            } else if (arr[s][1] == arr[e][1]) {//같으면 x 비교
                if (arr[s][0] < arr[e][0]) {
                    temp[idx] = arr[s];
                    idx++;
                    s++;
                } else {
                    temp[idx] = arr[e];
                    idx++;
                    e++;
                }
            } else {
                temp[idx] = arr[e];
                idx++;
                e++;
            }
        }
        if (s > mid) {
            while (e <= end) {
                temp[idx] = arr[e];
                idx++;
                e++;
            }
        } else {
            while (s <= mid) {
                temp[idx] = arr[s];
                idx++;
                s++;
            }
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
}