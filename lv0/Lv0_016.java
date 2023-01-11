package lv0;

class Lv0_016 {
    public static void  main(String[] args) {
		String my_string = "KIMSORYEON";
		String letter = "KIM";
        System.out.println(solution(my_string, letter));
    }
    //특정 문자 제거하기
    public static String solution(String my_string, String letter) {
		String answer = my_string.replace(letter, "");
		 return answer;
    }
}