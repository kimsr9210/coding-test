class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" } ;
        for(int i =0; i < a.length; i++) {
        	s = s.replace(a[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}