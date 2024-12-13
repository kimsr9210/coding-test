class Solution {
    public String solution(String rsp) {
    	String answer = "";
    	for(String arr : rsp.split("")) {
    		//equals는 내용을 비교한다
    		//==는 주소값을 비교한다
    		if(arr.equals("2")) answer += "0";
    		if(arr.equals("0")) answer += "5";
    		if(arr.equals("5")) answer += "2";
    	}
        return answer;
    }
}