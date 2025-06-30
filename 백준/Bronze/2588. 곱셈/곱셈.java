import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        String y = sc.next();
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < y.length(); i++) {
            list.add(y.charAt(i) - '0');
        }
        
        int a = x * list.get(2);
        int b = x * list.get(1);
        int c = x * list.get(0);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + (b * 10) + (c *100));
        
        sc.close();
    }
}