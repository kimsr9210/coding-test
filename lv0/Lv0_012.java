package lv0;

class Lv0_012 {
    public static void  main(String[] args) {
		String my_string = "I love you~";
        System.out.println(solution(my_string));
    }
    //문자열 뒤집기
    public static String solution(String my_string) {
    	//String클래스에서는 reverse() 메소드를 제공하지 않아 StringBuffer로 변환해서 사용해야한다. 
    	//reverse() 문자열 뒤집는 메서드
        StringBuffer sb = new StringBuffer(my_string);
        //reverse()메소드를 사용하면 StringBuffer객체로 return하기 때문에 toString을 사용하여 String으로 변환
        String answer = sb.reverse().toString(); 
        return answer;
    }
}