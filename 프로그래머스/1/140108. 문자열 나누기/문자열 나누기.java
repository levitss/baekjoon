import java.io.IOException;
import java.util.*;

class Solution {
    private static List<String> extracted(String s,List<String> list) {

        int count_another=0;
        int count_x=1;
        char temp = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char x = s.charAt(i);
            if (   x != temp) {
                count_another++;
            }else {
                count_x++;
            }
            if (count_another == count_x) {

                String str1 = s.substring(0,i+1);
                String str2 = s.substring(i + 1, s.length());
                list.add(str1);
                if (str2.equals("")) {
                    return list;
                }
                list=extracted(str2,list);
                return list;
            }
            // 짜투리
//x와 x가 아닌 다른 글자가 나온 횟수를 카운트

        }
        String str1 = s.substring(0,s.length());
        list.add(str1);

        return list;
    }
    public int solution(String s) {
          int count = 0;
        int answer = 0;
        int count_another = 0;
        List<String> list = new ArrayList<>();
        list = extracted(s, list);

        return list.size();
    }
}