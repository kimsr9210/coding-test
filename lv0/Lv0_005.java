package lv0;

class Lv0_005 {
    public static void  main(String[] args) {
		int[] numbers = {2,4,6,8,10};
        System.out.println(solution(numbers));
    }
    //배열 두 배 만들기
    public static int[] solution(int[] numbers) {
		//    	정수 배열 numbers가 매개변수로 주어집니다. 
		//    	numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
				/*
				 * ArrayList<Integer> answer = new ArrayList<>(); 
				 * for(int num : numbers){
				 * 		answer.add(num*2); 
				 * } 
				 * return answer; 
				 * }
				 */
				int[] answer = new int [numbers.length]; //길이만큼 생성      
				for(int i = 0; i<numbers.length;i++) {
					answer[i] = numbers[i]*2;
					System.out.println(answer[i]);
				}
				return answer;
    }
}