class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<myString.length();i++){
            char a=myString.charAt(i);
            if(a=='A') {
                a='B';
            }else {
                a='A';
            }
            
            
            sb.append(a);
            //길이 이상이면 그때부터 체크 들어감
            if(sb.length()>=pat.length()){
                if(sb.substring(sb.length()-pat.length(),sb.length()).equals(pat)) return 1;
            }
        }
        return answer;
    }
}