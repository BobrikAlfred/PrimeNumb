import java.util.Scanner;

public class PowTwo {
    static boolean[] b;
    static int quantity = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scanner.nextInt() + 1;
        b = new boolean[n];
        getPrimalB(n);

        for (int i = 2; i < b.length; i++) {
            if (!b[i]) {
                quantity++;
            }
        }
        int[] a = new int[quantity];
        int k = 0;
        for (int i = 2; i < b.length; i++) {
            if (!b[i]) {
                a[k] = i;
                k++;
            }
        }
        int sum = 0;
        for (int j : a) sum += j;
        int l = (int) Math.ceil(Math.log(sum) / Math.log(2));
        System.out.println("наименьший показатель степени 2 больше или равной сумме простых чисел меньше введенного числа: " + l);
    }
    public static void getPrimalB(int n) {
        for (int i = 2; (i * i) < n; i++) {
            if (!b[i]) {
                for (int j = i*i; j < n; j += i) {
                    b[j] = true;
                }
            }
        }
    }
}