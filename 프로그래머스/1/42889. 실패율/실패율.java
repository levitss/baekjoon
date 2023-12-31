import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer;
        //stage의 원소 수를 체크
        int [] floors=new int [N+2];
        Map <Integer,Double> map=new HashMap<>();
        
        for(int i=0;i<stages.length;i++){
            floors[stages[i]]+=1;
            
            
        }
            //아직 해당 위치인 사람/도전한 사람
            //stream.filter?
            
            
                //1 1  1/8여기 값 / 아래 합   지나간 것 보단 현재 수가 중요
                //2 3  3/7
                //3 2  2/4
                //4 1  1/2
                //5 0  0/1
                //6 1
        int userNumber=stages.length;
        int sum=0;
        int temp=0;
        
        for(int i=1;i<floors.length-1;i++){
            temp=floors[i];
            if(userNumber==0){
                map.put(i,0.0);
            }else{
                
                map.put(i,(double)temp/(double)userNumber);
            }
            userNumber-=temp;
            
        }
        //높은게 위
        List<Map.Entry<Integer,Double>>list=new LinkedList<>(map.entrySet());
                list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        // list.sort((i1,i2)->{
        //    return i2.getValue().intValue()-i1.getValue().intValue(); 
        // });
        answer=new int [list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i).getKey();
        }
        
        
        return answer;
    }
}