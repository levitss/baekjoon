import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //클래스를 만드는게 아니라 st 로 나누고 if 나 케이스로
        //케이스는 jdk17
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        String str=null;
        String command = null;
        StringBuilder sb = new StringBuilder();
        int a=0;
        int sum=0;
        for (int j = 0; j < i; j++) {
            a = Integer.parseInt(br.readLine());
            if (a == 0) {
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
                continue;
            }
            list.add(a);
            sum += a;
        }
        System.out.println(sum);

    }


} // End of class
