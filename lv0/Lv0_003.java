package lv0;

class Lv0_003 {
    public static void  main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        System.out.println(solution(arr,  3));
    }
    //중복된 숫자 개수
    public static int solution(int[] arr, int n) {
    	int answer = 0;
    	for(int l : arr) {
    		if(n == l) {
    			answer++;
    		}
    	}
		return answer;
    }
}