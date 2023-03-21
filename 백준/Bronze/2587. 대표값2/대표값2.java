import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum=0;
        int a;
//  평균과 중앙값을 구하기.
        //중앙값은 수를 크기 순서대로 늘어놓았을 때 가장 중앙에 있는 것
        for (int i = 0; i < 5; i++) {
            a = Integer.parseInt(br.readLine());
            list.add(a);
            sum+=a;
        }
        Collections.sort(list);


        System.out.println(sum/list.size());
        System.out.println(list.get(2));


    }
}


