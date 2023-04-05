import java.util.*;
public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int answer = 0;
        if(A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
        	answer = 1;
        }
        System.out.println(answer);
    }
}