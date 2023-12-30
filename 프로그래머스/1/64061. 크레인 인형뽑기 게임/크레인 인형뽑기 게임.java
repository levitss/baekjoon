import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer=0;

        //결과 스택에 2개 중복되어 사라지는 회수;
        List<Stack<Integer>>list=new ArrayList();
        for(int i=board.length-1;i>=0;i--){
            
            for(int j=0;j<board[i].length;j++){
                //처음 회차엔 스택 만들어서 채움
                if(i==board.length-1){
                    Stack<Integer> stack=new Stack();
                    list.add(stack);
                }
                if(board[i][j]==0)continue;
                list.get(j).push(board[i][j]);
            }
            
        }
        Stack<Integer> basket=new Stack();
        for(int i=0;i<moves.length;i++){
            int num=moves[i];

            if(list.get(num-1).isEmpty()){
                
                continue;
            }
            int pop=list.get(num-1).pop();
           
            if(basket.isEmpty()){
                basket.push(pop);
                continue;
            }

            if(pop==basket.peek()){
                basket.pop();
                answer++;
                continue;
            }

            basket.push(pop);




        }

        return answer*2;
    }
}