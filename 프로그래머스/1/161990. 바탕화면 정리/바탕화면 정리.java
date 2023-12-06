class Solution {
    public int[] solution(String[] wallpaper) {
          //각 줄의 가장 맨 처음에 나오는 #이 시작점. 같으면 arr 앞에 있는 것.
        //마찬가지로 맨 마지막에 나오는 #이 종료점.
        int min=Integer.MAX_VALUE;
        int lux=Integer.MAX_VALUE;
        int luy=Integer.MAX_VALUE;
        int rdx=0;
        int rdy=0;
        int max=0;
        for(int i=0;i<wallpaper.length;i++){
            String str=wallpaper[i];
            for(int o=0;o<str.length();o++){
                char c=str.charAt(o);
                if(c=='#'){
                    if(o<=luy) {
                        if(i<=lux){
                            lux=i;

                        }
                        luy=o;
                    }
                    if(i>=rdx){
                        if(o>=rdy){

                            rdy=o;
                        }
                        rdx=i;

                    }

                }
            }

        }
        int[] answer = {lux,luy,rdx+1,rdy+1};

        return answer;
    }
}