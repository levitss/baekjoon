class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int rest=0;
        int order=0;
        if(chicken<10) return 0;
        while(chicken>=10){
            order+=chicken/10;
            
            chicken=chicken/10+chicken%10;
            // if(chicken==1) break;
        }
        
        return order;
    }
}
// 1081/10=108 나머지 1
// 108/10=10 나머지 8
// 10/10=1 나머지 0
// 1+8+1=10
// 10/10=1 나머지 0
// 108+10+1+1

// 1081/10=108 나머지 1
// 109/10=10 나머지 9
// 19/10= 1 나머지 9
// 10/10=1 나머지 0



    