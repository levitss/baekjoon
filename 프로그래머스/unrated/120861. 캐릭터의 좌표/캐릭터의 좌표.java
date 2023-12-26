class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x=0;
        int y=0;
        
        int maxX=board[0]/2;        
        int minX=-board[0]/2;
        int maxY=board[1]/2;
        int minY=-board[1]/2;
        
        
        for(String a:keyinput){
            switch(a){
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
            }
            if(x>maxX)x--;
            if(x<minX)x++;
            if(y>maxY)y--;
            if(y<minY)y++;
            
        }
        return new int [] {x,y};
    }
}