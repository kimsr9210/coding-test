import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums); //정렬

        for(int i = 0 ; i < nums.length; i++) { //0 0 0
        	for(int j = i + 1; j < nums.length; j++) { //1
        		for(int k = j + 1 ; k < nums.length; k++) { //2
        			int prime = nums[i] + nums[j] + nums[k];
        			answer += (isPrime(prime)) ? 1 : 0; //메소드 호출 (재귀함수)
        		}
        	}
        }
        return answer;
    }
    
    public boolean isPrime (int prime) {
    	for(int i = 2 ; i < prime; i++) { 
    		if(prime % i == 0) { 
    			return false ; //소수가 아니면 여기에 옴
    		}
    	}
    	return true;
    }
}