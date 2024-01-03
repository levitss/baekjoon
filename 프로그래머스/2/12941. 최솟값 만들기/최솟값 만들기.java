import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //서로 역순으로 정렬
        List<Integer>list1=new ArrayList();
        List<Integer>list2=new ArrayList();
        for(int i=0;i<A.length;i++){
            list1.add(A[i]);
            list2.add(B[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2,Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            answer+=list1.get(i)*list2.get(i);
        }


        return answer;
    }
}