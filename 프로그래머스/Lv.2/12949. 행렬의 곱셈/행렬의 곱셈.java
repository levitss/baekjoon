class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //arr1Col==arr2Row 
        int lenCol1=arr1[0].length;
        int lenRow1=arr1.length;
        int lenCol2=arr2[0].length;
        int lenRow2=arr2.length;
        int[][] answer =new int[lenRow1][lenCol2];
        for(int i=0;i<lenRow1;i++){
            for(int j=0;j<lenCol2;j++){
                int sum=0;
                for(int k=0;k<lenCol1;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                answer[i][j]=sum;
            }
            
         
            
        }
        return answer;
    }
}
