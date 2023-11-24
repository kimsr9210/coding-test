import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int answer = 0;
		for(int i = 1; i*i <= num; i++) {
			answer++;
		}
		System.out.println(answer);
    }
}