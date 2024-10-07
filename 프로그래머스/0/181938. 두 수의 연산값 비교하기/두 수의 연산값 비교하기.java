class Solution {
    public int solution(int a, int b) {
        String plus = String.valueOf(a) + String.valueOf(b); 
        int mltpl = 2 * a * b;
        if(Integer.parseInt(plus) == mltpl) return a+b;
        int answer = Math.max(Integer.parseInt(plus),mltpl);
        return answer;
    }
}