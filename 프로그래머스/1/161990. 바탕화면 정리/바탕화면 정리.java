import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
    	int[] answer = new int [4];
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(int x = 0; x < wallpaper.length; x++) {
        	String[] wallpapers =  wallpaper[x].split("|");
        	for(int y = 0; y < wallpapers.length; y++) {
        		if(wallpapers[y].equals("#")) {
        			//제일위
        			if(!hashMap.containsKey("lux")) {
        				hashMap.put("lux", x);
        			}
        			
        			//제일왼쪽
        			if(!hashMap.containsKey("luy")) {
        				hashMap.put("luy", y);
        			}else {
        				if(hashMap.get("luy") > y) hashMap.put("luy", y);
        			}

        			//제일오른쪽
        			if(!hashMap.containsKey("rdy")) {
        				hashMap.put("rdy", y+1);
        			}else {
        				if(hashMap.get("rdy") <= y) hashMap.put("rdy", y+1);
        			}
        			
        			//제일아래
        			if(!hashMap.containsKey("rdx")) {
        				hashMap.put("rdx", x+1);
        			}else {
        				if(hashMap.get("rdx") <= x) hashMap.put("rdx", x+1);
        			}
        		}
        	}
        }
        answer[0] = hashMap.get("lux");
        answer[1] = hashMap.get("luy");
        answer[2] = hashMap.get("rdx");
        answer[3] = hashMap.get("rdy");
        return answer;
    }
}