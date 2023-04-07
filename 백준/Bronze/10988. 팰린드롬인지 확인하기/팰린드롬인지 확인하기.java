import java.util.*;
public class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        String reverse = "";

        for(int i = text.length()-1; i >= 0 ; i--) { 
        	reverse += text.charAt(i);
        }
        int answer = (text.equals(reverse)) ? 1 : 0;
        System.out.println(answer);
	}
}