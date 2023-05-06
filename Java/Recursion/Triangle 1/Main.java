public class Main {
    public static void triangle(int n){
        if(n==0){
            return;
        }
        for(int i=1;i<=n;i++){
            System.out.print("*"+' ');
        }
        System.out.println();
        triangle(n-1);
    }
    public static void main(String[] args) {
        triangle(4);
    }
}
