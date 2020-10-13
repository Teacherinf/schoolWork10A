package loop3_rec;

public class Main {
    public static String pyad(int n){
        if (n == 1){
            return "1";
        }else
        {
            return n + " " + pyad(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(pyad(10));

    }
}
