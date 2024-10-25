import java.util.*;
class Solution {
    public int solution(String numbers) {
         //소수 : 1과 자기자신으로만 나누어 지는 수
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        check("", numbers, hashSet);
        for(int i : hashSet){
            int num = i;
            if(num == 2) answer++;
            else if(isPrime(num)) answer++;
        }
        return answer;
    }

    //소수인지 확인하는 함수
    public boolean isPrime(int num){
        if(num == 0 || num == 1) return false;

        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public void check(String str, String numbers, HashSet<Integer> hashSet){
        int n = numbers.length();
        if(!str.equals("")){
            hashSet.add(Integer.valueOf(str));
        }

        for(int i = 0; i < n; i++){
            check(str + numbers.charAt(i), numbers.substring(0,i) + numbers.substring(i + 1), hashSet);
        }
    }
}