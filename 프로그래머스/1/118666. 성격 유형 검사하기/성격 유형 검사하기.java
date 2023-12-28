import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuffer sb=new StringBuffer();
        Map<String,Integer> scores=new HashMap();
        String [] sArr={"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"};
        for(String str:sArr){
            String []s=str.split("");
            String under4=s[0];
            String over4=s[1];
            scores.put(under4,0);
            scores.put(over4,0);
            
        }
        for(int i=0;i<survey.length;i++){
            String str=survey[i];
            int score=choices[i];
            
            String arr[]=str.split("");
            String under4=arr[0];
            String over4=arr[1];
            if(!scores.containsKey(under4)) scores.put(under4,0);
            if(!scores.containsKey(over4)) scores.put(over4,0);
            
            if(score==4) continue;
            if(score<4){
                scores.put(under4,scores.get(under4)+(4-score));
            }
            if(score>4){
                scores.put(over4,scores.get(over4)+(score-4));
            } 
        }
        // 정렬하는 방식으로는 각 지표별 map을 만들어야 함.
        
        int R=scores.get("R");
        int T=scores.get("T");
        if(R>T)sb.append("R");
        if(R<T)sb.append("T");
        if(R==T)sb.append("R");
        
        int C=scores.get("C");
        int F=scores.get("F");
        if(C>F)sb.append("C");
        if(C<F)sb.append("F");
        if(C==F)sb.append("C");
        int J=scores.get("J");
        int M=scores.get("M");
        if(J>M)sb.append("J");
        if(J<M)sb.append("M");
        if(J==M)sb.append("J");
        int A=scores.get("A");
        int N=scores.get("N");
        if(A>N)sb.append("A");
        if(A<N)sb.append("N");
        if(A==N)sb.append("A");
        
            
            
            
            
        // List<Map.Entry<String,Integer>> list=new LinkedList(scores.entrySet());  
        // Collections.sort(list,(i1,i2)->{
        //     if(i2.getValue()==i1.getValue()){
        //         char a=i1.getKey().charAt(0);
        //         char b=i2.getKey().charAt(0);
        //         return a-b;
        //     }
        //     return i2.getValue()-i1.getValue();
        // });
        
        
        
        return sb.toString();
    }
}