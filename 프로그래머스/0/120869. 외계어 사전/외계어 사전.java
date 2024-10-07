class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int size = spell.length;
        for(int i = 0; i < dic.length; i++) {
        	int cnt = 0;
        	for(int s = 0; s < spell.length; s++) {
        		if(dic[i].contains(spell[s])) cnt++;
        	}
        	if(size == cnt) {
        		answer = 1; 
        		break;
        	}
        }
        return answer;
    }
}