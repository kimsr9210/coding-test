package codingTestSkills;

import java.util.Arrays;

public class Step2_2 {

	public static void main(String[] args) {
		Step2_2 step2_2 = new Step1_3(); 

		int[] people = {1, 2, 3}; //참가자의 상의 크기
		int[] tshirts = {1, 1}; //주최가 가진 티셔츠 크기
		step2_2.solution(people, tshirts);
		
	}

    public int solution(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int answer = 0;

        int i = tshirts.length - 1;
        for (int j = people.length - 1; j >= 0 && i >= 0; j--) {
            if (tshirts[i] >= people[j]) {
                answer += 1;
                i -= 1;
            }
        }

        return answer;
    }
}
