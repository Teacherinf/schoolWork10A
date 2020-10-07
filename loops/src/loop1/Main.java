package loop1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
//Вывод таблицы умножения через While
       System.out.println("введите параметр таблицы умножения ");
        int a = tt.nextInt();
        int n = 1;
        while (n<=10){
            System.out.println(a + " * " + n + " = " + a*n);
            n++;
        }

//Вывод таблицы умножения через Do


    }
}
