class Solution {
    public int solution(int[] date1, int[] date2) {
        // int answer = 0;
        // int a=date1[0]*10000+date1[1]+100+date1[2];
        // int b=date2[0]*10000+date2[1]+100+date2[2];
        // if(date1[0]<date2[0]) {
        //     return 1;
        // }
        // if(date1[1]<date1[1]&&date1[0]==date2[0]){
        //     return 1;
        // }
        // if(date1[2]<date2[2]&&date1[1]==date1[1]&&date1[0]==date2[0]){
        //     return 1;
        // }
        // return 0;
        // answer=a<b?1:0;
        
        // return answer;
         // 연도 비교
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] == date2[0]) {
            // 월 비교
            if (date1[1] < date2[1]) {
                return 1;
            } else if (date1[1] == date2[1]) {
                // 일 비교
                if (date1[2] < date2[2]) {
                    return 1;
                }
            }
        }
        // 그 외의 경우는 date1이 date2와 같거나 뒤에 있는 경우
        return 0;
    }
}