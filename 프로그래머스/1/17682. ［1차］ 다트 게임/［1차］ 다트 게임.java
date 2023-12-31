import java.util.*;
class Solution {
    public int solution(String dartResult) {
      List<Integer> list=new ArrayList<>();
        Set<Character> set = new HashSet<>();
        set.add('#');
        set.add('*');
        //10의 경우는?
        for(int i=0;i<dartResult.length();i++){
            char c=dartResult.charAt(i);
            if(Character.isAlphabetic(c)||set.contains(c)){
                int lastIndex=list.size()-1;

                //문자면
//                 if(c=='S'){

//                 }
                if(c=='D'){
                    list.set(lastIndex,  (int)Math.pow(list.get(lastIndex),2));


                }

                if(c=='T'){
                    list.set(lastIndex, (int) Math.pow(list.get(lastIndex),3));
                }


                    //추가 검사
                if(c=='*'){
                    //전부가 아니라 바로 전 것 까지
                    
                    list.set(lastIndex, list.get(lastIndex) * 2);
                    if(lastIndex==0) continue;
                    list.set(lastIndex-1, list.get(lastIndex-1) * 2);
                    

                }
                if(c=='#'){
                    //마지막 값 *-1
                    list.set(lastIndex,list.get(lastIndex)*-1);
                }
                continue;
            }

            //숫자면
            if(dartResult.charAt(i+1)=='0'){
                list.add(10);
                i++;
                continue;

            }
            list.add(c-'0');
        }
        
        return list.stream().reduce(Integer::sum).get();
        //숫자를 기준으로 나눔
        //맨 뒤에 * 현재 전체점수 2배 # 해당 점수 마이너스
        //동시에 붙지는 않음
    }
}
