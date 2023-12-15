class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int index=0;

        for(int j=1;j<=number;j++){
            for(int i=1;i*i<=j;i++){
                if(j%i==0){

                    index+=2;
                }

            }
            if(index>limit) index=limit;
            answer+=index;
            index=0;
        }
        answer+=-1;


        return answer;
    }
}