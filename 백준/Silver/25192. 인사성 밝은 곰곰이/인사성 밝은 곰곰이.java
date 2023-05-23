import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws IOException {
//        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String E = "ENTER";
        Set<String> set = new HashSet<>();
        int cnt = 0;
        String str = null;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            if (str.equals(E)) {
                set.clear();
                continue;
            }
            if (set.contains(str)) {
                continue;
            }
            set.add(str);
            cnt++;
        }
        System.out.println(cnt);

    }
}
