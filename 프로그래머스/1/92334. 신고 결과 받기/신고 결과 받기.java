import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        //맵을 이중으로?
        //신고된 대상, 횟수
        Map <String,Integer> reports=new HashMap();
        //신고 대상 리스트 생성
        for(String str:id_list){
            reports.put(str,0);
        }
        //신고한 사람, 신고된 사람 리스트
        Map <String,Object> reporters=new HashMap<>();
        
        for(String str:report){
            String[]arr=str.split(" ");
            String reporter=arr[0];
            String reported=arr[1];
            //reporters에 해당 신고자 없으면 리스트 생성
            if(!reporters.containsKey(reporter)) reporters.put(reporter,new ArrayList<String>());
            //리스트에 대상 없으면 add 있으면 넘김
            List<String> list=(List)reporters.get(reporter);
            if(list.contains(reported)) {
                continue;
            }
            list.add(reported);
            //신고된 사람 카운트
            reports.put(reported,reports.get(reported)+1);
            
            
            
        }
        //신고 한 사람의 리스트에 
        for(int i=0;i<id_list.length;i++){
            String name=id_list[i];
            List <String> target=(List)reporters.get(name);
            if(target==null) continue;
            for(Map.Entry<String,Integer> map:reports.entrySet()){
                if(map.getValue()>=k){
                    if(target.contains(map.getKey())){
                        answer[i]+=1;
                    }
                }
            }
                
            
        }
        
        return answer;
    }
}