class Solution {
    public int solution(int[] wallet, int[] bill) {
        int min = Math.min(bill[0],bill[1]);
        int max = Math.max(bill[0],bill[1]);

        if(wallet[0] >= min && wallet[1] >= max || wallet[1] >= min && wallet[0] >= max) return 0;

        int answer = 0;
        while(true){
            answer++;

            max = max / 2;

            //지갑에 들어갈 수 있는지 확인.
            if(wallet[0] >= min && wallet[1] >= max || wallet[1] >= min && wallet[0] >= max) return answer;

            //없으면 다음 로직 실행
            if(min > max){
                int divide = max;
                max = min;
                min = divide;
            }
        }
    }
}