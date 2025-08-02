import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        
        int result;
        
        if (X == Y && Y == Z) {
            result = 10000 + X * 1000;
        } else if (X == Y || Y == Z || Z == X) {
            if (X == Y) {
                result = 1000 + X * 100;
            } else if (Y == Z) {
                result = 1000 + Y * 100;
            } else {
                result = 1000 + Z * 100;
            }
        } else {
            if (X > Y && X > Z) {
                result = X * 100;
            } else if (Y > Z && Y > Z) {
                result = Y * 100;
            } else {
                result = Z * 100;
            }
        }
        
        System.out.printf("%d", result);
        
        sc.close();
    }
}