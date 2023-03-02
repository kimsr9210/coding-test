class Solution {
    public int solution(int slice, int n) {
    	//(/ -> 일반적인 나누기 연산, % -> 나누기를 한 후 나머지를 구하는 연산 )
    	int answer = (n % slice == 0) ? n / slice : n / slice +1;
        return answer;
    }
}