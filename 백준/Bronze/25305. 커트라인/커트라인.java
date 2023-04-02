import java.io.*;
import java.util.StringTokenizer;


public class Main {
//    public static void swap(int[] arr, int idx1, int idx2) {
//        int temp = arr[idx1];
//        arr[idx1] = arr[idx2];
//        arr[idx2] = temp;
//    }

    public static int[] tempArr;

    public static void sort(int arr[]) {
        tempArr = new int[arr.length];
        sort(arr,0, arr.length - 1);
        tempArr=null;
    }

    public static void sort(int[] arr, int left, int right) {
       if(left==right){
           return;
       }

            int mid = (right + left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);

    }
    public static void merge(int arr[], int left, int mid, int right) {
        int p1=left;
        int p2=mid+1;
        int idx = left; //채워넣을 배열의 인덱스
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {//p1 p2 비교해서 작은거 tempArr에 넣기
                tempArr[idx] = arr[p1];
                idx++;
                p1++;
            } else {
                tempArr[idx] = arr[p2];
                idx++;
                p2++;
            }
        }
        if (p1 > mid) {//남은 것들 ..이 있나?
            while (p2 <= right) {
                tempArr[idx] = arr[p2];
                idx++;
                p2++;
            }

        } else {
            while (p1 <= mid) {
                tempArr[idx] = arr[p1];
                idx++;
                p1++;
            }
        }
        for (int i = left; i <= right; i++) {
            arr[i] = tempArr[i];
        }




    }
    public static void main(String[] args) throws IOException {

        //평균과 중앙값 구하기
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2;
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int man = Integer.parseInt(st.nextToken());
        st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        sort(arr);
        System.out.println(arr[arr.length-man]);

    }
}