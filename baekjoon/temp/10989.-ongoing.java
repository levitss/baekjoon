import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void radixSort(int[] arr) {
// 최대값 구하기
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
       //counting sort로 정렬하기  digit는 자리수
        for (int digit = 1; digit <= max; digit *= 10) {
            countingSort(arr, digit);
        }
    }

    public static void countingSort(int[] arr, int digit) {
        int[] temp = new int[arr.length];   //임시 배열
        int[] counting = new int[arr.length];   //카운팅 배열
        for (int i = 0; i < arr.length; i++) {
            int num=(arr[i]/digit)%10;//해당 자리수의 숫자 추출
            counting[num]++;
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());//숫자
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));




//1. list 정렬 -----메모리 초과
// 기수 정렬 시도


    }
}


