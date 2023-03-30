import java.util.ArrayList;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] str = t.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i <= t.length() - p.length(); i++) {
        	arrayList.add(t.substring(i, i+p.length()));
        	//Integer.ParseInt 했더니 런타임에러가 떴다.
        	//String은 18자리 까지 될 수 있음  -> String을 int로 변환시 자릿수 오류
        	//Long.parseLong으로 변환
        	if(Long.parseLong(arrayList.get(i)) <= Long.parseLong(p)) answer++; 
        }
        return answer;
    }
}
