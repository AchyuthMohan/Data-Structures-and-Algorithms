public class Main {
    static int sum;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static boolean isPalin(int n){
        return sum==n;
    }
    public static void main(String[] args) {
        int n=12231;
        reverse(n);
        if(isPalin(n)){
            System.out.println("palin");
        }
        else{
            System.out.println("Not palin");
        }
    }
}
