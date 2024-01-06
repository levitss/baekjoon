class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        //홀수면 -1
        //그 후 /2 
        //index가 다르면 한번 더 /2
        int indexA=(a%2==0?a-1:a);
        int indexB=(b%2==0?b-1:b);
        // answer++;
        while(true){
            indexA/=2;
            indexB/=2;
            answer++;
            if(indexA==indexB)break;
        }
        
    
        //          0  1  2  3
        //         12 34 56 78
        // 
//                   4      7
//                      4
        return answer;
    }
}