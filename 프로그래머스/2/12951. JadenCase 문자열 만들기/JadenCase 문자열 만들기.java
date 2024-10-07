class Solution {
    public String solution(String s) {
        String answer = "";
        
        //마지막 글자가 공백인지 확인 하기 위해 만든 변수
        String empty = s.substring(s.length()-1,s.length());
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i ++) {
        	if(str[i].length() != 0) { //공백이 아니라면
        		String upper = str[i].substring(0,1).toUpperCase();
        		String lower =  str[i].substring(1).toLowerCase();
        		answer += (i != str.length-1 || empty.equals(" ")) ? upper + lower + " " : upper + lower ;
        	}else { //공백이라면
        		answer += " ";
        	}
        }
        return answer;
    }
}
