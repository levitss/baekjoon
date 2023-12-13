class Solution {
      private static boolean check(char c, String skip) {
        for (int i = 0; i < skip.length(); i++) {
            char c1 = skip.charAt(i);
            if (c1 == c) {
                return true;
            }
        }
        return false;
    }
    public String solution(String s, String skip, int index) {
          StringBuffer sb = new StringBuffer();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //스킵체크
            int temp = index;
            for (int j = 0; j < index; j++) {
                c++;
                 if (c > 'z') {
                    c = 'a';
                }
                if (check( c, skip)) {
                    index++;
                    continue;
                }
                
               
            }
            index = temp;
            sb.append(c);
        }
        return sb.toString();
    }
}