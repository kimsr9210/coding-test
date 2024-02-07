import java.util.*;
class Solution {
    public int solution(String numbers) {
        //소수 : 1과 자기자신으로만 나누어 지는 수
    	int answer = 0;
    	HashSet<Integer> hashSet = new HashSet<>(); //중복 불가
    	
    	permutation("", numbers, hashSet); 
    	
    	while(hashSet.iterator().hasNext()) {
    		int a = hashSet.iterator().next();
    		hashSet.remove(a);
    		if(a == 2) answer++;
    		if(a != 2 && isPrime(a)) answer++;
    	}
        
        return answer;
    }
    
    public boolean isPrime(int n) {
    	if(n == 0 || n == 1) return false;
        
    	boolean prime = true;
    	for(int i = 2; i < n; i++) {
    		if(n % i == 0) {
    			prime = false;
    			break;
    		}
    	}
    	return prime;
    }
    
    public void permutation(String prefix, String str, HashSet<Integer> hashSet) {
    	int n = str.length();
    	if(!prefix.equals("")) {
    		hashSet.add(Integer.valueOf(prefix)); //String을 Integer로 변환
    	}
    	for(int i = 0; i < n; i++) {
    		String prefixs = prefix + str.charAt(i);
    		String strs = str.substring(0, i) + str.substring(i+1, n);
    		permutation(prefixs, strs, hashSet);
    	}
    }
}