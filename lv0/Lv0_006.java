package lv0;

class Lv0_006 {
    public static void  main(String[] args) {
		int[] dot = {-3,2};
        System.out.println(solution(dot));
    }
    //점의 위치 구하기
    public static int solution (int[] dot) {
		/*
		 * x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다. --양수 + , 음수 -
		 * x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다. 
		 * x 좌표와 y좌표가 모두 음수이면 제3사분면에 속합니다. 
		 * x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
		 */
        int answer = 0;
        
        int arr1 = dot[0];
        int arr2 = dot[1];
        
        if(arr1 > 0 && arr2 > 0) {
        	answer = 1;
        }else if(arr1 < 0 && arr2 > 0) {
        	answer = 2;
        }else if(arr1 < 0 && arr2 < 0) {
        	answer = 3;
        }else {
        	answer = 4;
        }
        return answer;
    }
}