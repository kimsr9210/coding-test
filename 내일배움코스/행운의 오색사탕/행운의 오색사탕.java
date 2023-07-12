package codingTestSkills;

//행운의 오색사탕(진행중)
public class Step3_5 {
	public static void main(String[] args) {
		Step3_5 step3_5 = new Step3_5(); 

		String candy = "RYRYRGPRYRYRBB";
		int[] positions = {12, 1, 14, 7};
		
		//String candy = "BPBRBPBRB";
		//int[] positions = {3, 6, 9}; //	[1, 1, 2]
		step3_5.solution(candy, positions);
		
    }
	
    public int[] solution(String candy, int[] positions) {
        int[] answer = new int [positions.length];

        for(int i = 0 ; i < positions.length; i++) {
        	if(positions[i] == 1) continue;
        	
        	String str = candy.substring(0, positions[i]);

        	int each = str.length() / 2;
        	if(str.length() % 2 != 0) each = each + 1;

        	for(int j = 0; j < each; j++) {
        		String cut1 = str.substring(0, j+1);
        		String cut2 = str.substring(str.length()-(j+1), str.length());

        		if(cut1.equals(cut2)) answer[i] = answer[i]+1;
        	}
        }
        return answer;
    }
}
