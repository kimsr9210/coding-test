import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toUpperCase();
		
		int[] cnt = new int[26]; //알파벳 갯수만큼 생성
		
		for(int i = 0 ; i < str.length(); i++) {
			int num = str.charAt(i) - 'A';
			cnt[num]++;
		}
		
		int max = 0;
		char answer = '?';
		for(int i = 0; i < cnt.length; i++) { //길이 26
			if(max < cnt[i]) {
				max = cnt[i];
				answer = (char)(i + 'A');
			}else if(max == cnt[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}