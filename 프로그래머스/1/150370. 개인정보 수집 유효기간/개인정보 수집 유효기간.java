import java.io.IOException;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] split = today.split("\\.");
        int today_y = Integer.parseInt(split[0]);
        int today_M = Integer.parseInt(split[1]);
        int today_d = Integer.parseInt(split[2]);

        Map<String, Integer> construct = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {

            String[] s = terms[i].split(" ");

            construct.put(s[0], Integer.parseInt(s[1]));

        }
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<privacies.length;i++) {
            String str = privacies[i];
            int year = Integer.parseInt(str.substring(0, 4));
            int month = Integer.parseInt(str.substring(5, 7));
            int day = Integer.parseInt(str.substring(8,10));
            String type = str.substring(11, 12);
            int limit = construct.get(type);
            //limit는 달 수 1~100

            int ref_year = year + limit / 12;
            int ref_month = month + limit % 12;
            if (ref_month > 12) {
                ref_year += ref_month / 12;
                ref_month = ref_month % 12;

            }
            if (ref_year <today_y) {
                list.add(i+1);
                continue;
            }
            if (ref_year ==today_y&&ref_month < today_M) {

                list.add(i+1);
                continue;
            }
            if (ref_year ==today_y&&ref_month == today_M&&day <= today_d) {
                list.add(i+1);
            }

        }
        answer= list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}