import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int a,b,c;
//        a = Integer.parseInt(st.nextToken());
//        b = Integer.parseInt(st.nextToken());
//        c = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        while (list.get(0) + list.get(1) <= list.get(2)) {
            list.set(2, list.get(2)-1);
        }

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        //늘이지는 못하고 줄이기만 가능
        //주어진 것을 최소 조건에 맞게 조작


    }
}
