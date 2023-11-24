import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int answer = 0;
        if(A == B && B == C && C == A){
            answer = 10000+(A*1000);
        }else if(A != B && B != C && C != A){
            answer = Math.max(Math.max(A,B),C) * 100;
        }else {
        	int num = 0;
        	if(A == B || A == C) {
        		num = A;
        	}else if(B == C){
        		num = B;
        	}
        	answer = 1000 + (num * 100);
        }
        
        System.out.println(answer);
    }
}