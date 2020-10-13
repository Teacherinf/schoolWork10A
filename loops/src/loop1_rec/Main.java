package loop1_rec;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static String recursion(int n){
        if (n==1){
            return "1";
        }
        return n + " " + recursion(n-1);
    }
    public static int fact(int a){
        if (a == 1){
            return 1;
        }
        return fact(a - 1)*a;
    }

    public static void main(String[] args) {
        System.out.println("Вывод чисел методом рекурсия ");
        System.out.println(recursion(12));
        System.out.println("вычисление факториала методом рекурсия");
        System.out.println(fact(9));
    }
}
