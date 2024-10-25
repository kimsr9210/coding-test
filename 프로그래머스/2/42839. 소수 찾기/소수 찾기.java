import java.util.*;
class Solution {
    public int solution(String numbers) {
        //소수 : 1과 자기자신으로만 나누어 지는 수
    	//길이가 1 ~ 6
    	//소수를 몇개를 만들 수 있는지 return
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        check("", numbers, hashSet);
        
        while(hashSet.iterator().hasNext()) {
        	int num = hashSet.iterator().next();
        	hashSet.remove(num);
        	if(num == 2){
                answer++;
            } else if (isPrime1(num)) {
                answer++;  
            }
        }
        return answer;
    }
    
    public boolean isPrime1(int num) {
    	if(num == 0 || num == 1) return false;
    	
    	//소수 찾기
    	boolean prime = true;
    	for(int i = 2; i < num; i++) {
    		if(num % i == 0) {
    			prime = false;
    			break;
    		}
    	}
    	return prime;
    	
    }
    
    public void check(String str, String numbers, HashSet<Integer> hashSet) {
    	int n = numbers.length();
    	if(!str.equals("")) {
    		hashSet.add(Integer.parseInt(str)); //String을 Integer로 변환
    	}
    	for(int i = 0; i < n; i++) {
    		check(str + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1, n), hashSet);
    	}
    }
}