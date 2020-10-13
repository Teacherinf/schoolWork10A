package loop2_rec;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static int recursion(int n) {
    // Базовый случай
    if (n < 10) {
        return n;
    }// Шаг рекурсии / рекурсивное условие
    else {
        return n % 10 + recursion(n / 10);
    }
}
    public static void main(String[] args) {
        System.out.println("введите число");
        int a = tt.nextInt();
            System.out.println(recursion(a)); // вызов рекурсивной функции
    }
}
