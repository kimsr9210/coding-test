class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k); //n진수 n진법
        String[] arr = str.split("0"); //0을 기준으로 배열 생성

        for(String a : arr){
            if(isPrime(a)) answer++;
        }
        
        return answer;
    }

    public boolean isPrime(String a){
        if(a.equals("")) return false;
        
        long l = Long.parseLong(a);
        if(l < 2) return false; //1은 소수가 아님
        
        for(int i = 2; i <= Math.sqrt(l); i++){
            if(l % i == 0) return false; //소수가 아님
        }
        
        return true; //소수
    }
}