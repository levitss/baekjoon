import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[]xArr= new int [10]; 
        int[]yArr= new int[10]; 
        String[]xS=X.split("");
        String[]yS=Y.split("");
        
        for(int i=0;i<X.length();i++){
            xArr[Integer.parseInt(xS[i])]+=1;
            
        }
        for(int i=0;i<Y.length();i++){
            yArr[Integer.parseInt(yS[i])]+=1;
        }
        int val=0;
//배열 만들어서 자리 별로 나온 수 체크
        for(int i=9;i>=0;i--){
            val=yArr[i]>=xArr[i]?xArr[i]:yArr[i];
            if(val==0)continue;
            for(int j=0;j<val;j++){
                sb.append(i);
            }
            
        }
        if(sb.length()==0) return "-1";
        if(sb.charAt(0)=='0')return "0";
        return sb.toString();
    }
}