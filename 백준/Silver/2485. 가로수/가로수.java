import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList();
        int[] arr = new int[n];
        int[] arr1 = new int[n-1];

//이미 정렬되어있음?
        int gcd = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                arr1[i-1] = arr[i] - arr[i - 1];
                gcd=gcd(arr1[i-1], gcd);
            }
        }

        int cnt = 0;
        for (int i=0;i<arr1.length;i++) {
            cnt += (arr1[i] / gcd)-1;
        }
        System.out.println(cnt);

    }
}
