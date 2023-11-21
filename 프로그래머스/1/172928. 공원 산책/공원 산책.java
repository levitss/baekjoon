
class Solution {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        //2. 장애물이 존재하는지 체크
        int x = 0;
        int y = 0;
        //가로 세로 순
        int height = park.length;
        int width = park[0].length();
        //1. 시작점 기록.
        begin:
        for (int i = 0; i < park.length; i++) {
            String s = park[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'S') {
                    y = i;
                    x = j;
                    break begin;
                }
            }
        }

        //2. 명령수행
        for (int i = 0; i < routes.length; i++) {
            String[] routeArr = routes[i].split(" ");
            String direction = routeArr[0];
            int distance = Integer.parseInt(routeArr[1]);
            //가로
            int x_ = x;

            if (direction.equals("E")) {
                for (int j = 0; j < distance; j++) {
                    x++;
                    if (x >= width) {
                        x = x_;
                        break;
                    }
                    if (park[y].charAt(x)=='X') {
                        x = x_;
                        break;
                    }
                } 
            }
            if (direction.equals("W")) {
                for (int j = 0; j < distance; j++) {

                    x--;
                    if (x <0) {
                        x = x_;
                        break;
                    }
                    if (park[y].charAt(x)=='X') {
                        x = x_;
                        break;
                    }
                }
            }
            int y_ = y;

            if (direction.equals("N")) {

                for (int j = 0; j < distance; j++) {

                    y--;
                    if (y <0) {
                        y = y_;
                        break;
                    }


                    if (park[y].charAt(x)=='X') {
                        y = y_;
                        break;
                    }
                }
            }
            if (direction.equals("S")) {
                for (int j = 0; j < distance; j++) {
                    y++;
                    if (y >= height) {
                        y = y_;
                        break;
                    }
                    if (park[y].charAt(x)=='X') {
                        y = y_;
                        break;
                    }
                }
            }





            //1. 현재위치에서 공원 벗어나는지 체크


        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }


}