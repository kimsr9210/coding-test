class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int open = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(str[0] != '(') {
        		answer = false;
        		break;
        	}else if(open == -1) {
        		answer = false;
        		break;
        	}else if(str[i] == '(') {  //열은 만큼 닫아야함
        		open++;
        	}else {
        		open--;
        	}
        }
        if(open != 0) answer = false;
        return answer;
    }
}