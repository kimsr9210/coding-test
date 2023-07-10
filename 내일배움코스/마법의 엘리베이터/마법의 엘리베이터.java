package codingTestSkills;

public class Step3_2 {
	public static void main(String[] args) {
		Step3_2 step3_2 = new Step3_2(); 

		int storey = 2554;
		step3_2.solution(storey);
		
	}

    public int solution(int storey) {
        return elevator(storey);
    }
    
    public int elevator (int floor) {
    	
    	if(floor <= 1) return floor; 
	    
    	int under10 = floor % 10; //나머지 6 , 2 
    	int rest = floor / 10; //몫 1
    	
    	int sum1 = under10 + elevator(rest); //6 + 1
    	int sum2 = (10 - under10) + elevator(rest + 1); //10 - 6 = 4;  , 2
    	return Math.min(sum1, sum2);
    }
}
