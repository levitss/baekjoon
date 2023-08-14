import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        Queue<Print> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.clear();
            st = new StringTokenizer(br.readLine()," ");
            int m = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            int idx = 0;
            int max = 0;
            st = new StringTokenizer(br.readLine(), " ");
            boolean b = false;
            for (int j = 0; j < m; j++) {
                int a = Integer.valueOf(st.nextToken());
                if (target == j) {
                    b = true;
                } else b = false;
                queue.add(new Print(b,a));
            }

            //큐 길이 돌려서 맥스값 구한 다음 poll
            //해당 값이 true면 break

            sb.append(extracted(queue, idx, max)).append("\n");
        }
        System.out.println(sb);



    }

    private static int extracted(Queue<Print> queue, int idx, int max) {
        while (true) {
            //맥스값 구하기
            for (int j = 0; j < queue.size(); j++) {
                Print poll = queue.poll();
                if (max < poll.a) {
                    max = poll.a;
                }
                queue.add(poll);
            }
            for (int j = 0; j < queue.size(); j++) {
                Print poll = queue.poll();
                if (max == poll.a) {
                    idx++;
                    max = 0;
                    if (poll.b) {
                        return idx;
                    }
                    break;
                } else {
                    queue.add(poll);
                }
            }


        }
    }


}
class Print{
    boolean b;
    int a;
    public Print(boolean b, int a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public String toString() {
        return String.valueOf(a) +":"+ String.valueOf(b);
    }
}