import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        //모두 같거나 //hashMap.size() == 1
        //모두 다르거나 //hashMap.size() == 4
        //두가지 두가지 같거나 //hashMap.size() == 2
        //두가지만 같고 나머지 두개는 각각 다름 //hashMap.size() == 3
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.merge(a, 1, Integer::sum);
        hashMap.merge(b, 1, Integer::sum);
        hashMap.merge(c, 1, Integer::sum);
        hashMap.merge(d, 1, Integer::sum);

        System.out.println(hashMap);

        if(hashMap.size() == 1) answer = 1111 * a;

        if(hashMap.size() == 2){
            ArrayList<Integer> key = new ArrayList<>(hashMap.keySet());
            ArrayList<Integer> value = new ArrayList<>(hashMap.values());
            Collections.sort(key);
            Collections.sort(value);
            if(value.get(0) == 2){
               answer =  (key.get(1) + key.get(0)) * (key.get(1) - key.get(0));
            }

            else{
                int num1 = 0;
                int num2 = 0;
                for(Integer k : hashMap.keySet()){
                    if(hashMap.get(k) == 3) num1 = k;
                    if(hashMap.get(k) == 1) num2 = k;
                }

                answer = 10 * num1;
                answer = answer + num2;
                answer = answer * answer;
            }
        }

        if(hashMap.size() == 3){
            for(Integer key : hashMap.keySet()){
                if(hashMap.get(key) != 2){
                    if(answer == 0) answer = key;
                    else answer = answer * key;
                }
            }
        }

        if(hashMap.size() == 4) {
            int min = a;
            for(Integer key : hashMap.keySet()){
                min = Math.min(min, key);
            }
            answer = min;
        }

        System.out.println(answer);
        return answer;
    }
}