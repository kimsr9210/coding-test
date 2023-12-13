class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastAattacks = attacks[attacks.length-1][0]; //마지막 공격
        int stamina = health; //현재 체력
        int t = 0; //연속 성공 시간
        
        int index0 = 0;
        for(int i = 1; i <= lastAattacks; i++) {
        	if(attacks[index0][0] == i) { //공격시간
        		int attack = attacks[index0][1]; //공격
        		stamina = stamina - attack;
        		if(stamina <= 0) return -1;	
                t = 0;
                index0++;
        	}else if(attacks[index0][0] != i && health >= stamina) { //공격시간이 아니면서, 체력이 깍였으면
        		if(t <= bandage[0] && stamina < health) { //체력회복
        			stamina = stamina + bandage[1];
        			t++;
        		}
        		if(t == bandage[0]) {
        			stamina = stamina + bandage[2];
        			t = 0;
        		}
        		if(stamina > health) {
        			stamina = health;
        		}
        	}
        }
        int answer = stamina;
        return answer;
    }
}