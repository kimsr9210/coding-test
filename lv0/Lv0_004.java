package lv0;

class Lv0_004 {
    public static void  main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
    //배열 뒤집기
    public static int[] solution (int[] num_list) {
    	//선언과 동시에 배열 크기 할당
    	//int[] arr = new int[]
    	int[] answer =  new int [num_list.length]; //5
    	int idx = 0;
    	for(int i = num_list.length-1; i >= 0 ; i--) {
    		answer[idx] = num_list[i];
    		System.out.println(answer[idx]);
    		idx++;
    	}
		return answer;
    }
}