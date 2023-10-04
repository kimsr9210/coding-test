class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < queries.length; i++){
            String start = "";
            sb.setLength(0); //초기화
            
            if(queries[i][0] != 0) start = my_string.substring(0, queries[i][0]);

            //뒤집을 문자 
            answer = my_string.substring(queries[i][0], queries[i][1]+1);
            sb.append(answer); //sb에 추가
            sb.reverse(); //문자 뒤집기
            
            String end = my_string.substring(queries[i][1]+1, my_string.length());
            
            my_string = start + sb + end;
        }
        answer = my_string;
        return answer;
    }
}