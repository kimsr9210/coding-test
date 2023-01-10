package lv0;

class Lv0_008 {
    public static void  main(String[] args) {
		int n = 9;
        System.out.println(solution(n));
    }
    //피자 나눠먹기
    public static int solution(int n) {
		/*
		 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 
		 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 
		 * 하는 solution 함수를 완성해보세요.
		 */
        int answer = 0;
        answer = (int) Math.ceil((double)n/7); //형변환
		/*
		 * answer = n/7; 
		 * if(n%7!=0) answer++;
		 */
        return answer;
    }
}