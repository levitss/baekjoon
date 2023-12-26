class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int refX=dots[0][0];
        int refY=dots[0][1];
        int x=0;
        int y=0;
        //x가 같은 것과 y가 같은 것 찾아내기
        for(int i=1;i<4;i++){
            if(dots[i][0]==refX){
                if(refY>dots[i][1]){
                    y=refY-dots[i][1];
                    
                }else{
                    y=dots[i][1]-refY;
                }
            }
            if(dots[i][1]==refY){
                if(refX>dots[i][0]){
                    x=refX-dots[i][0];
                    
                }else{
                    x=dots[i][0]-refX;
                }
            }
            
            
        }
        
        return x*y;
    }
}