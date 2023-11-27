import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int a = 0, b = 1, c = 0;
		
		for(int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(c);
    }
}