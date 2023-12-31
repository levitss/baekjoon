import java.util.*;class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        //map에 담고
        //entry정렬 후
        //value
        
        //set에 넣고?
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int size=set.size();
        //종류의 최대치
        if(size>(int)(nums.length/2))return (int)(nums.length/2);
        
        return size;
    }
}