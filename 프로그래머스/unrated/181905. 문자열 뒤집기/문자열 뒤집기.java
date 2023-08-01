class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0,s);
        
        //뒤집을 문자
        StringBuffer sb = new StringBuffer(my_string.substring(s,e+1));
        sb.reverse().toString();
        
        String end = my_string.substring(e+1,my_string.length());
        
        String answer = start+sb+end;
        return answer;
    }
}