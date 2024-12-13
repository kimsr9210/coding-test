class Solution {
    public int solution(int i, int j, int k) {
    	int answer = 0;
    	String str = "";
        for(int size = i; size <= j; size++ ) {
        	str += String.valueOf(size);
        }

        char change = (char)(k +'0');
        for(int m = 0; m < str.length(); m++) {
        	if(change == str.charAt(m)) answer++;
        }
        return answer;
    }
}