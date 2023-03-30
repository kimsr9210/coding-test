class Solution {
    public long solution(int n) {
        //피보나치 수열 : 앞의 두 수를 더하면 다음 숫자가 나오게 된다
        //공식 : f(n) = f(n - 1) + f(n - 2)
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;
        for(int i = 3 ; i <= n; i++) {
        	answer[i] = (answer[i-1] + answer[i-2]) % 1234567;
        }
        return answer[n];
    }
}