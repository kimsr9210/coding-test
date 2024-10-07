class Solution {
    public int[] solution(int n, int m) {
        //최대공약수 : 두 수의 공통된 수로 나누어진 몫의 곱셈
    	//최소공배수 : 두 수의 공통된 수로 나누어진 몫과 나머지의 곳셈
        int[] answer = new int [2]; //최대공약수, 최소공배수
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        answer[0] = gcd(max, min); //재귀함수
        answer[1] = max * min / answer[0];
        return answer;
    }
    
    static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
}