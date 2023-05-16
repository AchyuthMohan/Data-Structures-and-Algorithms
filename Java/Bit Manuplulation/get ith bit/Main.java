public class Main {
    public static int getIthBit(int n, int i){
        if((n&(1<<i))==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 1));
        System.out.println(getIthBit(6, 3));
    }
}
