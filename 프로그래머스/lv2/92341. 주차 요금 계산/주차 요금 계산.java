import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
class Solution {
    public int[] solution(int[] fees, String[] records) {

        ArrayList<String> cars = new ArrayList<>(); //차량번호
        HashMap<String,Integer> parking = new HashMap<>(); //주차중인 차
        HashMap<String,Integer> times = new HashMap<>(); //총 주차한 시간
        
        for(String record : records){
            String[] rc = record.split(" ");
            int time = getMin(rc[0]);
            String car = rc[1]; //차량번호
            
            //새로운 차가 있다면
            if(!cars.contains(car)){
                cars.add(car);
                times.put(car,0);
            }

            //현재 주차 되어 있는차가 출차 한다면
            if(parking.containsKey(car)){
                times.put(car, times.get(car) + (time - parking.get(car)));
                parking.remove(car);
            }else{
                parking.put(car,time);
            }
        }
     
        Collections.sort(cars); //정렬
                      
        int[] answer = new int [cars.size()];
        int lastParking = getMin("23:59");
        for(int i = 0; i < cars.size(); i++){
            answer[i] = fees[1]; //기본요금
            String car = cars.get(i);
            int time = times.get(car) - fees[0]; //누적 시간중 기본요금 시간 제외
            
            //출차가 안된 차는 마지막 시간으로 계산
            if(parking.containsKey(car)){
                time += (lastParking - parking.get(car));
            }
            
            //요금 정산
            if(time > 0){
                answer[i] += (Math.ceil(time / (fees[2] * 1.0)) * fees[3]);
            }
        }
        
        return answer;
    }
    
    public int getMin(String time){
        String[] t = time.split(":"); 
        return Integer.valueOf(t[0]) * 60 + Integer.valueOf(t[1]);
        
    }
}