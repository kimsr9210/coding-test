class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int arr : numbers) {
        	sum += arr;
        }
        
        answer = (double)sum / numbers.length; //double로 형변환
        return answer;
    }
}