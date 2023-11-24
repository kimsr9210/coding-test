import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < num; i++) {
			int n = scan.nextInt();
			if(n == 0) stack.pop();
			else stack.push(n);
		}
		
		int answer = 0;
		for(int s : stack) {
			answer += s;
		}
		
		System.out.println(answer);
    }
}