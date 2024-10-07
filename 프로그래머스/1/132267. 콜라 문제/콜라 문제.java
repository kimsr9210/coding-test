class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; //보너스 콜라갯수
        int rest = 0; //나머지 콜라
        while(n >= a) {
            rest = n % a; 
            n = (n / a) * b;
            answer += n;
            n += rest; //남아있는 콜라를 더해서 다으멩 마트갈 때 이용
        }
        return answer;
    }
}
