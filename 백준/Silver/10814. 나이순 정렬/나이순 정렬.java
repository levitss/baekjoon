import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//1. 나이순으로 정렬
//2. 같으면 가입한 순(초기 순서)대로 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String [][]arr = new String[n][2];//0은 나이 1은 이름
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int g = 0; g < 2; g++) {
                arr[i][g] = st.nextToken();
            }
        }
        sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
public static String[][]temp;
    public static void sort(String[][] arr) {
        temp = new String[arr.length][2];
        sort(arr, 0, arr.length - 1);
        temp = null;
    }

    public static void sort(String[][] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid,end);
    }





    private static void merge(String[][] arr, int start,int mid,int end) {
        int s = start;
        int e = mid + 1;
        int idx = start;
        while (s <= mid && e <= end) {
            if (Integer.parseInt(arr[s][0]) <= Integer.parseInt(arr[e][0])) {   //처음은 나이비교
                temp[idx] = arr[s];
                idx++;
                s++;
            }
            else{
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