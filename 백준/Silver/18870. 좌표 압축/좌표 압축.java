import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//1. 일단 정렬
//2. 순위에 따라 낮은것부터 0,1,2 값 -> 맵

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] arr2 = arr.clone();
        sort(arr);
        sort2(arr,arr2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
public static int[]temp;
    public static Map<Integer, Integer> map ;

    public static int[] sort2(int[] arr,int[]arr2) {
        map = new HashMap<>(arr.length);
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                continue;
            }
            map.put(arr[i], a++);

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr2[i]);
        }
        return arr;
    }

    public static void sort(int[] arr) {
        temp = new int[arr.length];
        sort(arr, 0, arr.length - 1);
        temp = null;
    }

    public static void sort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid,end);
    }





    private static void merge(int[] arr, int start,int mid,int end) {
        int s = start;
        int e = mid + 1;
        int idx = start;
        while (s <= mid && e <= end) {
            if (arr[s] <= arr[e]) {
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