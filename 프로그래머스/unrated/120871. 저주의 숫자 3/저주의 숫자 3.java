class Solution {
    public int solution(int n) {
        int answer = 0;
        //3 들어가면 안되고 3의 배수 안되고
        int [] arr=new int [101];
//         for(int i=1;i<=100;i++){
//             if(i%3==0) {
//                 arr[i]=1;
//                 continue;
//             }
//             if(i/10==3) {
//                 arr[i]=1;
//                 continue;
//             }
//             if(i%10==3){
//                 arr[i]=1;
//                 continue;
//             }
            
            
        
//         }
        
        for(int i=1;i<101;i++){
            
            ++answer;
            while(answer%3==0||answer/10==3||answer%10==3||(answer/10)%10==3){
                answer++;
                
            }
            
            if(i==n)return answer;
        
        }
        
        return answer;
    }
}