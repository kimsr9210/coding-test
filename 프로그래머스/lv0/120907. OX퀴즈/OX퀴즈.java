class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        int cnt = 0;
        boolean result = true;
        for(String q : quiz) {
        	String math = q;
        	String[] str = math.split(" ");
        	if(str[1].equals("-")) {
        		result = Integer.valueOf(str[4]).equals(Integer.valueOf(str[0]) - Integer.valueOf(str[2]));
        	}else { //+
        		result = Integer.valueOf(str[4]).equals(Integer.valueOf(str[0]) + Integer.valueOf(str[2]));
        	}
    		answer[cnt] = (result == true) ? "O" : "X";
        	cnt++;
        }
        return answer;
    }
}