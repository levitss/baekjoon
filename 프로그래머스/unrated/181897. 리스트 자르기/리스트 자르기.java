class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start=0;
        int end=0;
        int interval=1;
        switch(n){
            case 1:
                start=0;
                end=slicer[1];
                
                break;
            case 2:
                start=slicer[0];
                end=num_list.length-1;
                break;
            case 3:
                start=slicer[0];
                end=slicer[1];
                break;
            case 4:
                start=slicer[0];
                end=slicer[1];
                
                //간격이 c
                interval=slicer[2];
                int[] answer = new int[(end-start)/interval+1];

                int j=0;
                for (int i=start;i<=end;){
                    
                   answer[j]=num_list[i];
                    i+=interval;
                    j++;
                }
                return answer;
            
        }
        
                int[] answer = new int[end-start+1];
        for (int i=start;i<=end;i++){
            
            answer[i-start]=num_list[i];
        }

        
        
        
        
        return answer;
    }
}