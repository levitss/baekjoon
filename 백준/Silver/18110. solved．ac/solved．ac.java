import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int integer = Integer.valueOf(br.readLine());
            sum += integer;
            list.add(integer);
        }
        Collections.sort(list);
        int size = list.size();
        //사이즈의 상위 15퍼 하위 15퍼 삭제 반올림
        int ceil = (int) Math.round(size * 0.15);
        for (int i = 0; i < ceil; i++) {
            sum -= list.remove(0);
            sum-=list.remove(list.size() - 1);
        }
        double round2 = Math.round(sum / list.size());

        System.out.println((int)round2);
    }

}
