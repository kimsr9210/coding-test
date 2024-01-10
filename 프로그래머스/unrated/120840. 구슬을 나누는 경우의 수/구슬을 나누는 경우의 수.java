class Solution {
    public int combinations(int n, int m){
        if(m == 0 || n == m) {
            return 1;
        }else {
            return combinations(n-1, m-1) + combinations(n-1, m);
        }
    }

    public int solution(int balls, int share) {
        int answer = 0;
        answer = combinations(balls, share);
        return answer;
    }
}
