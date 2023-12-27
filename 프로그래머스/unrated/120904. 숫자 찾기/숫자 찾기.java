class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n=String.valueOf(num);
        String[] arr=n.split("");
        for (int i=0;i<n.length();i++){
            if(arr[i].equals(String.valueOf(k))){
                return i+1;
            }
            
        }
        return -1;
    }
}