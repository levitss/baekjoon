import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer>list=new ArrayList();
        //정렬 후 리미트
        for(int a:people){
            list.add(a);
        }
        //back
        int indexB=list.size()-1;
        //front
        int indexF=0;
        
        
        Collections.sort(list);
        
       
        int sum=0;
        while(indexB>=indexF){
            sum+=list.get(indexB);
            
            // if(indexB==indexF)break;
            sum+=list.get(indexF);
            if(sum<=limit)indexF++;

            indexB--;
            answer++;
            sum=0;

        }
        
        
        
        return answer;
    }
}