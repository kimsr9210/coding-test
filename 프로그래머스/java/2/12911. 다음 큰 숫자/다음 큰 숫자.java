class Solution {
    public int solution(int n) {
        int answer = Integer.bitCount(n);
        while(true){
            n++;
            if(answer == Integer.bitCount(n)) return n;
        }
    }
}