class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5}; //5
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5,}; //8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10;
        
        //맞춘갯수 구하기
        int[] student = {0,0,0};
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[i % 5]) student[0]++; 
            if(answers[i] == b[i % 8]) student[1]++;
            if(answers[i] == c[i % 10]) student[2]++;
        }
        
        //가장 많이 맞춘 학생 구하기
        int max = Math.max(student[0],Math.max(student[1],student[2]));
        
        //동일한 갯수 맞춘 학생 수 구하기
        int num = 0;
        for(int s : student){
            if(s == max) num++;
        }

        int[] answer = new int [num];
        int idx = 0;
        for(int i = 0; i < student.length; i++){
            if(student[i] == max) answer[idx++] = i + 1;
        }
        
        return answer;
    }
}