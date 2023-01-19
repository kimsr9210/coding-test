import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
    	my_string = my_string.replaceAll("[^0-9]","");
    	String[] str = new String [my_string.length()];
        int[] answer = new int [my_string.length()];
    	str = my_string.split("");
        for(int i=0; i<str.length; i++) {
        	answer[i] = Integer.parseInt(str[i]);
        }
        Arrays.parallelSort(answer);
        return answer;
    }
}