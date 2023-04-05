import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N]; //배열의 길이 입력
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt(); //배열에 길이 만큼 값 입력
        }

        int v= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (v == array[i]) cnt++;
        }
        System.out.println(cnt);
    }
}