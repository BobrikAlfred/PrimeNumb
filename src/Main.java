import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static int length;
    static boolean[] b;

    public static void getPrimalB(int n) {
        for (int i = 2; (i * i) < n; i++) {
            if (!b[i]) {
                for (int j = i*i; j < n; j += i) {
                    b[j] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        length = scanner.nextInt() + 1;
        System.out.println(LocalTime.now());

        b = new boolean[length];
        getPrimalB(length);
        for (int i = 2; i < b.length; i++) {
            if (!b[i]) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println(LocalTime.now());

    }
}