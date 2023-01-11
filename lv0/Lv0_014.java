package lv0;

class Lv0_014 {
    public static void  main(String[] args) {
		String my_string = "love";
		int n = 5 ;
        System.out.println(solution(my_string, n));
    }
    //문자 반복 출력하기
    public static String solution(String my_string, int n) {
        //String answer = "";
        StringBuffer answer = new StringBuffer();
    	String[] strArray = my_string.split("");
    	for(String arr : strArray ) {
    		for (int i = 0 ; i < n; i++) {
    			answer.append(arr);

    		}
    	}
        return answer.toString();
    }
}