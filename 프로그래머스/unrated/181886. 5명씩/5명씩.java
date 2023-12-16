import java.util.*;class Solution {
    public String[] solution(String[] names) {
    String[] answer;

//        if(names.length<=5){
//             answer = new String[1];
//        }else{
//            answer = new String[names.length/5+1];
//        }
        List<String> list = new ArrayList<>();

        int j=0;
        for (int i = 0; i <names.length ; i++) {
            if(i%5==0){
                list.add(names[i]);

            }


        }
        return list.toArray(new String[list.size()]);
    }
}