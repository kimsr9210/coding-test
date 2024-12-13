class Solution {
    public int solution(String my_string) {
    	int answer = 0;
    	String str = my_string.replaceAll("[^0-9]","");
    	String[] arr = str.split(""); //문자열을 쪼개서 배열 생성
    	//String arr[] = new String[str.length()-1]; //길이만큼 배열을 생성
    	//arr = str.split("");
    	for(String n : arr) {
    		 answer += Integer.parseInt(n);
    	}
        return answer;
    }
}