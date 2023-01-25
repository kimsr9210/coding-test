class Solution {
    public String solution(int age) {
        String answer = "";
    	String[] alphabet = {"a","b","c","d","e","f","g","h","i"
    						,"j","k","l","m","n","o","p","q","r"
    						,"s","t","u","v","w","x","y","z"
    						};
    	String [] arr = String.valueOf(age).split(""); //n을 string으로 변환하여 하나식 잘라서 String 배열에 넣음
    	int num = 0;
    	for(String arr2 : arr) {
    		num = Integer.parseInt(arr2);
    		answer += alphabet[num];
    	}
        return answer;
    }
}