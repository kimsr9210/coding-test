import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {
    	boolean answer = true;
    	HashSet<String> hashSet = new HashSet<>();
    	for(int i = 0; i < phone_book.length; i++) {
    		hashSet.add(phone_book[i]);
    	}

    	for(String s : phone_book) {
    		for(int i = 1; i< s.length(); i++) {
    			if(hashSet.contains(s.substring(0,i))) {
    				answer = false;
    				return answer;
    			}
    		}
    	}
    	return answer;
    }
}