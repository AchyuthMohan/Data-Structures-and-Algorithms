public class Main {
    static boolean isPowerOf2(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOf2(3));
    }
}
