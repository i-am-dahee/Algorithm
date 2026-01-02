import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N];
        int[] sum = new int[N + 1];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + list[i - 1];
        }

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(sum[y] - sum[x - 1]);
        }

        sc.close();
    }
}