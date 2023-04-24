public class Main {
    public static void printer(int n){
        if(n==0){
            return;
        }
        printer(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        printer(10);
    }
}
