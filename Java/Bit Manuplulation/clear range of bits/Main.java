import java.lang.*;
public class Main {
    static int clearRangeOfBits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitMask=a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(15, 1, 2));
    }
}
