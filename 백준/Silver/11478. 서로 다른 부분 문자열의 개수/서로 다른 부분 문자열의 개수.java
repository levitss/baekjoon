import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            //첫 자리
            for (int w = i+1; w <= str.length(); w++) {
                set.add(str.substring(i, w));
            }
        }
        System.out.println(set.size());
    }
}