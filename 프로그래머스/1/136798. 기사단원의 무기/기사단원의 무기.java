class Solution {
     public static int solution(int number, int limit, int power) {
        int answer = 0;
        int index=0;

        for(int j=1;j<=number;j++){
            for(int i=1;i*i<=j;i++){
                if(j%i==0){
                    //제곱수의 경우는?
                    if (j / i == i) {
                        index++;
                        continue;
                    }
                    index+=2;
                }

            }
            if(index>limit) index=power;
            answer+=index;
            index=0;
        }


        return answer;
    }
}