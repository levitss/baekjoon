import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        while (list.size() >= 2) {
            list.remove(0);
            Integer i = list.get(0);
            list.remove(0);
            list.add(i);
        }


        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(1));
        }
    }
}
