class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5 ; //몫
        hp = hp % 5 ; //나머지
        
        if(hp >= 3) {
            answer += hp / 3 ;
            hp = hp % 3 ;
        }

        if(hp >= 1) {
            answer += hp / 1 ;
            hp = hp % 1 ;
        }
        return answer;
    }
}