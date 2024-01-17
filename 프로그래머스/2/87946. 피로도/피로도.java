class Solution {
    static int  answer;
    static boolean[] check;
        
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        check=new boolean[dungeons.length];
        calc(k,0,dungeons);
        return answer;
    }
    void calc(int k,int depth,int[][]dungeons){
        //매 라운드마다 answer에 맥스 값 반환
        for(int i=0;i<dungeons.length;i++){
            if(!check[i]&&k>=dungeons[i][0]){
                check[i]=true;
                //스태 소비
                calc(k-dungeons[i][1],depth+1,dungeons);
                check[i]=false;                    
            }
        }
        answer=Math.max(answer,depth);
    }
}