import java.util.LinkedList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        //0일경우 cache miss 적용
        if(cacheSize == 0) return cities.length * 5;
        
        // LinkedList는 각 원소마다 앞,뒤 원소의 위치값을 가지고 있음
        //내부적으로 양방향의 연결 리스트로 구성되어 있어 
        //참조하려는 원소에 따라 처음부터 정방향 또는 역순으로 순회 가능
        LinkedList<String> cache = new LinkedList<>();
        for(int i = 0; i < cities.length; i++) {
        	String s = cities[i].toUpperCase(); //대문자로 변환
        	if(cache.remove(s)) { //같은 문자가 있다면
        		answer += 1;
        		cache.add(s); //추가
        	}else {
        		answer += 5;
        		if(cache.size() >= cacheSize) { //cacheSize 보다 크거나 같다면
        			cache.remove(0); //LinkedList 첫번째 index삭제
        		}
        		cache.add(s);
        	}
        }
        return answer;
    }
}