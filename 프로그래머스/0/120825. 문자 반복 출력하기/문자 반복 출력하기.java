class Solution {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
    	String[] strArray = my_string.split("");
    	for(String arr : strArray ) {
    		//System.out.println(arr);
    		for (int i = 0 ; i < n; i++) {
    			answer.append(arr);
    		}
    	}
        return answer.toString();
    }
}