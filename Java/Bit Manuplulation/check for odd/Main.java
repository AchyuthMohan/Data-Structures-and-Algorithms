public class Main {
    static boolean isOdd(int n){
       if((n&1)==1){
        return true;
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        System.out.println(isOdd(5));
    }
}
