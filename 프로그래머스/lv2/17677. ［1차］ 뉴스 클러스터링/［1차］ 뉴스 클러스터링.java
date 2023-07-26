import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for(int i = 0; i < str1.length()-1; i++){
            String key = str1.substring(i,i+2).replaceAll("[^A-Z]", ""); //대문자로 치환;
            if(key.length() == 2) hashMap1.put(key, hashMap1.getOrDefault(key,0)+1);
        }

        for(int i = 0; i < str2.length()-1; i++){
            String key = str2.substring(i,i+2).replaceAll("[^A-Z]", ""); //대문자로 치환;
            if(key.length() == 2) hashMap2.put(key, hashMap2.getOrDefault(key,0)+1);
        }

        if(hashMap1.size() == 0 && hashMap2.size() == 0) return 65536;

        int same = 0; //교집합
        int notSame = 0; //합집합
        for(String k : hashMap1.keySet()){
            if(hashMap2.containsKey(k)){
                same += Math.min(hashMap1.get(k), hashMap2.get(k));
                notSame += Math.max(hashMap1.get(k), hashMap2.get(k));
                hashMap2.remove(k);
            }else{
                notSame += hashMap1.get(k);
            }
        }

        for(String k : hashMap2.keySet()){
            notSame += hashMap2.get(k);
        }

        float result = ((float) same / notSame) * 65536;
        answer = (int) result;
        return answer;
    }
}
