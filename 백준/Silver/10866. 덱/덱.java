import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        Que que = new Que();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if (s.equals("push_front")) {
                que.push_front(Integer.parseInt(st.nextToken()));
                continue;
            }
            if (s.equals("pop_front")) {
                sb.append(que.pop_front()).append("\n");
                continue;
            }
            if (s.equals("size")) {
                sb.append(que.size()).append("\n");
                continue;
            }
            if (s.equals("empty")) {
                sb.append(que.empty()).append("\n");
                continue;
            }
            if (s.equals("push_back")) {
                que.push_back(Integer.parseInt(st.nextToken()));
                continue;
            }
            if (s.equals("pop_back")) {
                sb.append(que.pop_back()).append("\n");
            }

            if (s.equals("front")) {
                sb.append(que.front()).append("\n");
            }

            if (s.equals("back")) {
                sb.append(que.back()).append("\n");
            }

        }
        System.out.println(sb);
    }

    static class Que{
        List<Integer> list;

        public Que() {
            this.list = new LinkedList();
        }

        public int pop_back() {
            try {
                return list.get(list.size()-1);
            } catch (Exception e) {
                return -1;
            }
            finally {
                if(list.size()>0) list.remove(list.size()-1);
            }
        }

        public void push_back(int x) {
            list.add(x);
        }

        public int pop_front() {
            try {
                return list.get(0);
            } catch (Exception e) {
                return -1;
            }
            finally {
                if(list.size()>0) list.remove(0);
            }
        }

        public void push_front(int x) {
            list.add(0,x);
        }

        public int size() {
            return list.size();
        }
        public int empty() {
            if (list.isEmpty()) {
                return 1;
            } else return 0;
        }

        public int front() {
            try {

                return list.get(0);
            } catch (Exception e) {
                return -1;
            }
        }
        public int back() {
            try {
                return list.get(list.size()-1);
            } catch (Exception e) {
                return -1;
            }
        }

    }



}
