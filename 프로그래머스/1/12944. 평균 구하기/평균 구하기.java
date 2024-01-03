import java.util.*;
class Solution {
    public double solution(int[] arr) {
        
        return (double)Arrays.stream(arr).reduce(Integer::sum).getAsInt()/arr.length;
        
    }
}