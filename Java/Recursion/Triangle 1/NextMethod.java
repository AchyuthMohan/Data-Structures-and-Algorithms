public class NextMethod {
    public static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            triangle(r, c + 1);
            System.out.print("*" + " ");
        } else {
            triangle(r - 1, 0);
            System.out.println();

        }
    }

    public static void main(String[] args) {
        triangle(7, 0);
    }
}