import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = scan.nextInt();
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < num; i++) arrayList.add(scan.nextInt());

        Collections.sort(arrayList); //오름차순 정렬
        
        for(Integer c : arrayList) sb.append(c).append("\n");

        System.out.println(sb);
    }
}