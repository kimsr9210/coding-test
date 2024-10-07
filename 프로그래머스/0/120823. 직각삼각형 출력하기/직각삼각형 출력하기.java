import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //repeat() 파라미터에 주어진 횟수만큼 반복하는 String 메소드
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
