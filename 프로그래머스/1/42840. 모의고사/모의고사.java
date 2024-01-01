import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int ln=answers.length;
       int a=0;

        int []arrA=new int[ln];
        int b=0;
        int [] arrforA={1,2,3,4,5};
        int []arrB=new int[ln];
        int [] arrforB={1,3,4,5};
        int c=0;
        int []arrC=new int[ln];
        for(int i=0;i<ln;i++){
            arrA[i]=arrforA[i%5];
        }
        int [] arrforC={3,1,2,4,5};

        int indexB=0;
        for(int i=0;i<ln;i++){
            if(i%2==0) {
                arrB[i]=2;
                continue;
            }
            arrB[i]=arrforB[indexB++%4];
        }

        int indexC=0;
        for(int i=0;i<ln;i++){
            if(i>=2&&i%2==0) indexC++;
            arrC[i]=arrforC[indexC%5];
        }
        //채점
        int max=0;
        for(int i=0;i<ln;i++){
            if(arrA[i]==answers[i])a++;
            if(max<a)max=a;
            if(arrB[i]==answers[i])b++;
            if(max<b)max=b;
            if(arrC[i]==answers[i])c++;
            if(max<c)max=c;
        }
        Map<Integer,Integer>map=new HashMap<>();
        if(max==a)map.put(1,a);
        if(max==b) map.put(2,b);
        if(max==c) map.put(3,c);
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(i1,i2)->{
            return i2.getValue()-i1.getValue();
        });
        int []ans=new int[list.size()] ;
        //맥스만 출력
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i).getKey();
        }
        
        return ans;
    }
}


