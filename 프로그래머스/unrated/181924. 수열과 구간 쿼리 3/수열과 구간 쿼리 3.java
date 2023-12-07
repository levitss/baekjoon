class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int a = query[0];
            int b = query[1];
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        return arr;
    }
}