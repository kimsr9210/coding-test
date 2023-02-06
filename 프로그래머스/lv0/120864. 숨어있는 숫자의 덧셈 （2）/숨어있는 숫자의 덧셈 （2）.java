class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String arr[] = my_string.split("[^0-9]+");
        for(String arr2 : arr) {
        	if(arr2.matches("[0-9]+")) {
        		answer += Integer.parseInt(arr2);
        	}
        }
        return answer;
    }
}