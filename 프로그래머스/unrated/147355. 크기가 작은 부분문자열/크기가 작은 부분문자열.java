import java.util.ArrayList;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] str = t.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i <= t.length() - p.length(); i++) {
        	arrayList.add(t.substring(i, i+p.length()));
        	if(Long.parseLong(arrayList.get(i)) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}