public class Main {
    static int count = 0;

    public static void counter(int n) {

        if (n == 0) {
            return;
        }
        if (n % 10 == 0) {
            count++;
        }

        counter(n / 10);
    }

    public static void main(String[] args) {
        int n = 1000;
        counter(n);
        System.out.println(count);
    }
}
