import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
    public static void sortByMergeSort(int[]arr) {
        int[] temp = new int[arr.length];//임시 arr 생성
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;// 0~10이면 5   mid를 구함
            mergeSort(arr, temp, left, m);//m이 end가 되어서 재귀
            mergeSort(arr, temp, m + 1, right);
            merge(arr, temp, left, m, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {//arr 복사
            temp[i] = arr[i];
        }
        int part1 = left;
        int part2 = mid + 1;
        int index = left;
        while (part1 <= mid && part2 <= right) {
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            } else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = temp[part1 + i];
        }

    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sortByMergeSort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append(arr[i]).append("\n");
        }
        br.close();

        System.out.println(sb);
//퀵정렬은 시간초과
        //병합정렬
    }
}


