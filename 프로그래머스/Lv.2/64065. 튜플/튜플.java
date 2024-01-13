import java.util.*;
class Solution {
    public int[] solution(String s) {
        //제일 긴거 뽑아내기?
        String []arr = s.replaceAll("\\},\\{",":").replaceAll("\\{","").replaceAll("\\}","").split(":");
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String[] strArr=arr[i].split(",");
            for(int j=0;j<strArr.length;j++){
                map.put(strArr[j],map.getOrDefault(strArr[j],0)+1);
            }
            
        }
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        
        Collections.sort(list,(i1,i2)->{
            return i2.getValue()-i1.getValue();
        });
        int answer[]=new int [list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=Integer.parseInt(list.get(i).getKey());
        }
        
        return answer;
    }
}