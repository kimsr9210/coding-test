class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0 , 0); //함수 호출
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int index, int sum){
        if(numbers.length == index){ //배열의 마지막 index까지 탐색이 끝났는지 확인
            if(target == sum){ //타겟과 합계과 같은지 확인
                answer++;
            }
        }else{
            //값을 더하고 다음 값 탐색
            dfs(numbers, target, index+1, sum + numbers[index]);
            
            //값을 빼고 다음 값 탐색
            dfs(numbers, target, index+1, sum - numbers[index]);
        }
    }
}