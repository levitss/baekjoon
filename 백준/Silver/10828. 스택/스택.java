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
        for (int j = 0; j < i; j++) {
            str = br.readLine();
            String[] s = str.split(" ");
            command = s[0];
            int q = 0;
            if (s.length == 2) {
                q = Integer.parseInt(s[1]);
            }
            if (command.equals("push")) {
                list.add(q);
            } else if (command.equals("top")) {
                if (list.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(list.get(list.size() - 1));
            }else if (command.equals("pop")) {
                if (list.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(list.remove(list.size() - 1));
            }else if (command.equals("size")) {
                System.out.println(list.size());
            }else if (command.equals("empty")) {
                
                if (list.isEmpty()) {
                    System.out.println(1);
                } else System.out.println(0);
            }
        }
    }


} // End of class
