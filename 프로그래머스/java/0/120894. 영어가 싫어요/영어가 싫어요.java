class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] text = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for(int i = 0 ; i < text.length; i++) {
        	numbers = numbers.replaceAll(text[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers); //String을 long으로 형변환
        return answer;
    }
}