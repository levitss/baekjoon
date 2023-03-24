import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int arr[] = new int[input.length()];
        //입력은 10억이하
        for (int i = 0; i < input.length(); i++) {
            arr[i] =input.charAt(i)-'0';
        }
        StringBuilder sb = new StringBuilder();
        sort(arr);
        for (int i : arr) {
            sb.append(i);
        }
        System.out.println(sb);

//퀵정렬은 pivot이 기준이고 병합정렬은 무조건 절반
    }

    public static void sort(int[] a) {
        pivot_sort(a, 0, a.length - 1);
    }

    public static void pivot_sort(int[] a, int low, int high) {
        //
        if (low >= high) {//배열이 비어있거나 하나
            return;
        }
//        int pivot=(low+high)/2;
        int pivot = partiton(a, low, high);
        pivot_sort(a, low, pivot);
        pivot_sort(a, pivot + 1, high);
    }

    public static int partiton(int[] a, int low, int high) {
        //각각 배열에서 1씩 떨어진 위치로 지정
        int hi=high+1;
        int lo=low-1;
        int pivot = a[(low + high) / 2];
        while (true) {
            do {
                lo++;
            } while (a[lo] >pivot);
            do {
                hi--;
            } while (a[hi] < pivot && lo <= hi);
            if (lo >= hi) {//끝까지 이상 없으면
                return hi;
            }
            swap(a, lo, hi);//a[lo]가 피벗보다 크고 a[hi]가 피벗보다 작을 경우
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }


}


