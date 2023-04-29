public class Main{
    public static int product(int n){
        if(n==1){
            return 1;
        }
        return n*product(n-1);
    }
    public static void main(String[] args) {
        int x=product(5);
        System.out.println(x);
    }
}