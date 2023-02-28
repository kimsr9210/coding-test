class Solution {
    public int solution(int n) {
        boolean[] check = new boolean[n+1]; //배열 길이 6
        //Arrays.fill(check, true); //배열의 값을 true로 초기화
        int answer = 0;
        for(int i = 2; i <= n; i++){ //반복 2 3 4 5
            if(!check[i]){  //false 일때 
                for(int j = i + i; j <= n; j+=i){  //4
                    check[j] = true;
                }
                answer++;
            }
        }
        return answer;
    }
}