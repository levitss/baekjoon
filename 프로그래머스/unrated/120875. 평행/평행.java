class Solution {
    public int solution(int[][] dots) {
        
      
        for(int i=0;i<dots.length;i++){
            int ix=dots[i][0];
            int iy=dots[i][1];
            for(int j=0;j<dots.length;j++){
                if(i==j) continue;
                int jx=dots[j][0];
                int jy=dots[j][1];
                
            for(int z=0;z<dots.length;z++){
                if(i==z||j==z) continue;
                int zx=dots[z][0];
                int zy=dots[z][1];
                    
                for(int c=0;c<dots.length;c++){
                    if(c==i||c==j||z==c) continue;
                    
                    int cx=dots[c][0];
                    int cy=dots[c][1];
                    //선 ij 의 기울기
                    double ij=(double)(iy-jy)/(ix-jx);
                    double zc=(double)(zy-cy)/(zx-cx);
                    if(ij==zc) return 1;
                    
                }   

            }   
                
            }   
        }
        return 0;
    }
}

