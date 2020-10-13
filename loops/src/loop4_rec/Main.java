package loop4_rec;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static int stepen(double n) {
    if (n == 1) {
        return 1;
    } // Базовый случай
    else if (n > 1 && n < 2) {
        return 0;
    } // Шаг рекурсии / рекурсивное условие
    else
        return stepen(n / 2);
    }


    public static void main(String[] args) {
        System.out.println("Введите число ");
        double a = tt.nextDouble();
        // вызов рекурсивной функции
        if (stepen(a) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}