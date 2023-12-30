class Solution {
    class Coor{
         int x=0;
         int y=0;
        String hand="";
        Coor (int a, int b){
            this.x=a;
            this.y=b;
        }

    }
    public String solution(int[] numbers, String hand) {
   //현재 위치
        Coor leftHand=new Coor(0,0);
        Coor rightHand=new Coor(0,0);
        StringBuffer sb=new StringBuffer();
       for(int number:numbers){
           
                   Coor co=new Coor(0,0);
           switch (number){
                case 1:
                   leftHand.x=0;
                   leftHand.y=3;
                   sb.append("L");
                   continue;
                case 4:
                   sb.append("L");
                   leftHand.x=0;
                   leftHand.y=2;continue;
                case 7:
                    sb.append("L");
                    leftHand.x=0;
                    leftHand.y=1;continue;
                case 3:
                    sb.append("R");
                    rightHand.x=2;
                    rightHand.y=3;continue;
                case 6:
                    sb.append("R");
                    rightHand.x=2;
                    rightHand.y=2;continue;
                case 9:
                    sb.append("R");
                    rightHand.x=2;
                    rightHand.y=1;continue;
                case 2:
                    co=new Coor(1,3);
                    break;
                case 5:
                    co=new Coor(1,2);
                    break;
                case 8:
                    co=new Coor(1,1);
                    break;
                case 0:
                    co=new Coor(1,0);
                    break;
           }
           
           int distL=Math.abs(co.x-leftHand.x)+Math.abs(co.y-leftHand.y);
           int distR=Math.abs(co.x-rightHand.x)+Math.abs(co.y-rightHand.y);
           if(distL==distR) {
               if(hand.equals("right")){
                   sb.append("R");
                                  rightHand=co;

                   continue;
               }
               if(hand.equals("left")){
                                  leftHand=co;

                   sb.append("L");
                   continue;
               }
               
           }
           if(distL>distR){
               rightHand=co;
               sb.append("R");
           }
           if(distL<distR){
               leftHand=co;
               sb.append("L");
           }
           
           
       }
        return sb.toString();
        
        
        
    }
}