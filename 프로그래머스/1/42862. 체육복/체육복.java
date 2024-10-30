class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int student[] = new int [n];
        
        for(int l : lost){ //체육복을 잃어버린 친구들
            student[l-1]--;
        }

        for(int r : reserve){ //체육복이 한개 더 있는 친구들
            student[r-1]++;
        }
        
        for(int i = 0; i < student.length; i++){
            if(student[i] == -1){
                if(i-1 >= 0 && student[i-1] == 1){ //체육복이 있는 친구 
                    student[i]++; //체육복 받음
                    student[i-1]--; //빌려줌
                }else if(i+1 < student.length && student[i+1] == 1){
                    student[i]++;
                    student[i+1]--;
                }else{
                    answer--;
                }
            }
        }

        return answer;
    }
}