import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
                int answer = 0; //인형을 제거하는 횟수
        
        //Stack() 자료구조
        //한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료 구조
        //가장 최근에 들어온 데이터가 가장 먼저 나감
        Stack<Integer> stack = new Stack<>(); //인형을 담는 바구니

        //move 값이 1부터 시작하게 값이 주어짐. 그래서 1을 빼야함
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]); //값 추가
                        board[j][move - 1] = 0;
                        break;
                    }
                    //stack.peek() : stack의 가장 상단의 값 출력
                    if (board[j][move - 1] == stack.peek()) { //같은 모양의 인형이 있다면
                        stack.pop(); //값 제거
                        answer += 2;
                    } else //같은 모양의 인형이 없다면
                        stack.push(board[j][move - 1]); 
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}