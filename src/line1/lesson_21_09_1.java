package line1;

import java.util.Scanner;

public class lesson_21_09_1 {
    static Scanner q = new Scanner(System.in);
    public static void main(String[] args) {
        int b1,b2;
        System.out.println("Введите двухзначное число ");
        int a = q.nextInt();
        b1 = a / 10;
        b2 = a % 10;
        System.out.println("Сумма цифр числа = " + (b1 + b2));
        System.out.println("Произведение цифр числа = " + (b1 * b2));
    }
}
