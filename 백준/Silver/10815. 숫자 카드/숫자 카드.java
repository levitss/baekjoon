

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (int i = 0; i < n2; i++) {
            sb.append(search(arr, n, Integer.parseInt(st2.nextToken()))).append(" ");

        }
        System.out.println(sb);
        
        }

    private static int search(int[] arr, int n, int target) {
        int first=0;
        int last = n - 1;
        int mid=-0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (arr[mid] == target) {
                return 1;
            }
            if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }
}




