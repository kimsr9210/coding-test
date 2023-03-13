class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int sum = 0;
        char[] arr = str.toCharArray(); //String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
        for(char c : arr) {
        	sum += Character.getNumericValue(c); //char를 int로 형변환
        }
        if(x % sum != 0) answer = false; 
        return answer;
    }
}