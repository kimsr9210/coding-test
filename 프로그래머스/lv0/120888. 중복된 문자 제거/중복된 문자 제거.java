import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        //char[] ch = my_string.toCharArray(); //문자열을 한 글자씩 쪼개서 char 배열에 넣어줌
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i ++) {
        	if(!arrayList.contains(String.valueOf(my_string.charAt(i)))) {
        		arrayList.add(String.valueOf(my_string.charAt(i)));
        	}
        }
        answer = String.join("", arrayList);
        return answer;
    }
}