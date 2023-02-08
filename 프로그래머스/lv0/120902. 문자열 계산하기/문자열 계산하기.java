class Solution {
    public int solution(String my_string) {
        String number[] = my_string.split(" "); 
        int answer = Integer.parseInt(number[0]);
        for(int i = 1; i < number.length; i+=2) {
        	if(number[i].equals("+")) {
        		answer += Integer.parseInt(number[i+1]);
        	}else {
        		answer -= Integer.parseInt(number[i+1]);
        	}
        }
        return answer;
    }
}