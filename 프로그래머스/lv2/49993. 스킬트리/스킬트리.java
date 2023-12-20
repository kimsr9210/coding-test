class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skills = skill.toCharArray();
            for(String s : skill_trees) {
            	String str = s.replaceAll("[^" + skill + "]", "");
            	int index = 0;
            	boolean same = true;
            	for(int i = 0; i < str.length(); i++) {
            		char c = str.charAt(i);
            		if(i == 0 && c != skills[0] || skills[index] != c) {
            			same = false;
            			break;
            		}
            		if(skills[index] == c) index++;
            	}
            	if(same) answer++;
            }
        return answer;
    }
}