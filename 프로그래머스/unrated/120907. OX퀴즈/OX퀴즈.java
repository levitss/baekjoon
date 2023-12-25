class Solution {
    public String[] solution(String[] quiz) {
        int i=0;
        String[] answer = new String[quiz.length];
        for(String str:quiz){
            String[]arr=str.split(" ");
            int a=Integer.parseInt(arr[0]);
            int b= Integer.parseInt(arr[2]);
            int c=Integer.parseInt(arr[4]);
            if(arr[1].equals("-")){
                if(a-b==c){
                    answer[i]="O";
                }else {
                    answer[i]="X";
                }
                    
            }
            if(arr[1].equals("+")){
                if(a+b==c){
                    answer[i]="O";
                }else {
                    answer[i]="X";
                }
                    
            }
            
            
            
            
            
            i++;
        }
        return answer;
    }
}