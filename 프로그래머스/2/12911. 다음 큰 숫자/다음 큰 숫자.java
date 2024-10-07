class Solution {
    public int solution(int n) {
        int answer = Integer.bitCount(n);
        while(true){
            n++;
            if(answer == Integer.bitCount(n)){ //이진수에 1의 개수를 세어주는 함수
                answer = n;
                return answer;
            }
        }
    }
}