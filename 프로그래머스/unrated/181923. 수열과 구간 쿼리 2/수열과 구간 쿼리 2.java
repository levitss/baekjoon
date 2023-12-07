class Solution {
    public int[] solution(int[] arr, int[][] queries) {
           int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            //s,e,k
            int s = query[0];
            int e = query[1];
            int k = query[2];
               int min = Integer.MAX_VALUE;
            for (int j = s; j <=e ; j++) {
                int i1 = arr[j];
                if (i1 > k) {

                    if (min > i1) {
                        min = i1;
                    }
                }

            }
            if(min != Integer.MAX_VALUE)
                answer[i] = min;
            else
                answer[i] = -1;
        }
        return answer;
    }
}