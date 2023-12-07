class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            //s,e,k
            int s = query[0];
            int e = query[1];
            int k = query[2];


            for (int j = s; j <=e ; j++) {
                if (j % k == 0) {
                    arr[j] += 1;
                }

            }

        }
        return arr;
    }
}