import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for(int i = 0; i < num; i++) {
			String str = scan.next();
			char front = str.charAt(0);
			char back = str.charAt(str.length()-1);
			String test = String.valueOf(front) +String.valueOf(back);
			System.out.println(test);
		}
	}
}
