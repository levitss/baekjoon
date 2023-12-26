class Solution {
    public int solution(String[] spell, String[] dic) {
        //한번씩만 사용한 단어.
        
        int answer = 0;
       koko: for(String word:dic){
        int [] arrr=new int [spell.length];
            String[] arr=word.split("");
            //각 스펠별 확인
            for (int j=0;j<spell.length;j++){
                
                for(int i=0;i<arr.length;i++){
                    //같은게 있으면 true
                    //이미 true인데 다시 요청할 경우엔 false
                    if(arr[i].equals(spell[j])){
                        arrr[j]+=1;
                        if(arrr[j]>1) continue koko;
                        
                    }
                }
            }
           //몇번 사용 되었나 체크
           for(int asd:arrr){
               if(asd==0){
                   continue koko;
               }
               
           }
           answer++;
           
           
            
        }
        if(answer==0) return 2;
        
        return answer;
    }
}