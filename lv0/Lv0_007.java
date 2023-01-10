package lv0;

class Lv0_007 {
    public static void  main(String[] args) {
		String[] dot = {"We", "are", "the", "world!"};
        System.out.println(solution(dot));
    }
    //배열 원소의 길이
    public static int[] solution (String[] strlist) {
    	//문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
        
        int[] answer = new int [strlist.length]; //길이만큼 생성
        int cnt = strlist.length;
        for(int i = 0; i < cnt; i++) {
        	answer[i] = strlist[i].length();
        }
		/* 다른 방법
		 * ArrayList<Integer> answer = new ArrayList<Integer>();
		 * 
		 * for(String str : strlist){ 
		 * answer.add(str.length()); 
		 * }
		 */ 
        return answer;
    }
}