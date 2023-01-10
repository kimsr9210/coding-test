package lv0;

class Lv0_010 {
    public static void  main(String[] args) {
		int money = 16000;
        System.out.println(solution(money));
    }
    //아이스 아메리카노
    public static int[] solution(int money) {
		/*
		 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
		 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 
		 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 
		 * return 하도록 solution 함수를 완성해보세요.
		 */	
        int[] answer = new int [2];
    	int some = money / 5500; ;
    	money = money % 5500;
    	
    	answer[0] = some;
    	answer[1] = money;

        return answer;
    }
}