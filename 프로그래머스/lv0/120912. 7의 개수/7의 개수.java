class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int arr : array) {
        	str += arr ;
        }
        str = str.replaceAll("[^7]","");
        answer = str.length();
        return answer;
    }
}