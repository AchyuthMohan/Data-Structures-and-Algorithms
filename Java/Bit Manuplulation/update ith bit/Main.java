public class Main {
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        n=clearIthBit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    static int clearLastIBits(int n,int i){
        int bitMask=((~0)<<i);
        return bitMask&n;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 2));
    
    }
}
