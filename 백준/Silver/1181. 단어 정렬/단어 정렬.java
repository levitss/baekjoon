import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//String 을 길이 짧은것으로 정렬
    //수가 같으면 알파벳 순으로 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String []arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (br.readLine());
        }
        sort(arr);
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        StringBuilder sb = new StringBuilder();
        for (String i : set) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
public static String[]temp;
    public static void sort(String[] arr) {
        temp = new String[arr.length];
        sort(arr, 0, arr.length - 1);
        temp = null;
    }

    public static void sort(String[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid,end);
    }

    private static void merge(String[] arr, int start,int mid,int end) {
        int s = start;
        int e = mid + 1;
        int idx = start;
        while (s <= mid && e <= end) {
            if (arr[s].length() < arr[e].length()) {   //처음은 length 비교
                temp[idx] = arr[s];
                idx++;
                s++;
            } else if (arr[s].length() == arr[e].length()) {//같으면 charat 비교
                int at=0;
                while (at<arr[s].length()) {
                    //완전히 같은 단어일때는 패스
                    if (arr[s].equals(arr[e])) {
                        temp[idx] = arr[s];
                        idx++;
                        s++;
//                        e++;
                        break;
                    }
                    if (arr[s].charAt(at) < arr[e].charAt(at)) {
                        temp[idx] = arr[s];
                        idx++;
                        s++;
                        break;
                    } else if (arr[s].charAt(at) == arr[e].charAt(at)) {

                        at++;
                        continue;
                    } else {
                        temp[idx] = arr[e];
                        idx++;
                        e++;
                        break;
                    }


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