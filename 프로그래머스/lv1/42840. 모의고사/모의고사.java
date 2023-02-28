import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int[] student1 = {1, 2, 3, 4, 5}; //5
        int[] student2 = {2,1,2,3,2,4,2,5}; //8
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        
        System.out.println(0 % 5); //-> index : 0
        System.out.println(1 % 5); //-> index : 1
        System.out.println(2 % 5); //-> index : 2
        System.out.println(3 % 5); //-> index : 3
        System.out.println(4 % 5); //-> index : 4
        System.out.println(5 % 5); //-> index : 5
        System.out.println(6 % 5); //-> index : 6
        for(int i = 0 ; i < answers.length; i++) {
        	if(answers[i] == student1[i % 5]) {
        		cnt1++;
        	}
        	if(answers[i] == student2[i % 8]) {
        		cnt2++;
        	}
        	if(answers[i] == student3[i % 10]) {
        		cnt3++;
        	}
        }

        //Math.max() : 더 큰수를 찾는 함수
        int max = Math.max(Math.max(cnt1,cnt2),cnt3); 
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(max == cnt1) arrayList.add(1);
        if(max == cnt2) arrayList.add(2);
        if(max == cnt3) arrayList.add(3);
        
        int[] answer = new int [arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++) {
        	answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
