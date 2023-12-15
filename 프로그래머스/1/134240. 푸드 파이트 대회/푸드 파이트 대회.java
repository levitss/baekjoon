class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb=new StringBuffer();
        sb.append(0);
        for(int i=food.length-1;i>0;i--){
            int target=food[i]-food[i]%2;
            for(int j=0;j<target/2;j++){
                sb.append(i);
                sb.insert(0,i);
            }
        }
        return sb.toString();
    }
}