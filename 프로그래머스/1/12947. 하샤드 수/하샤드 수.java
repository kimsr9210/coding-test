class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        char[] arr = String.valueOf(x).toCharArray(); 
        for(char c : arr) {
        	//sum += Character.getNumericValue(c); //char를 int로 형변환
            sum += (int) c - '0';
        }
        if(x % sum != 0) answer = false; 
        return answer;
    }
}