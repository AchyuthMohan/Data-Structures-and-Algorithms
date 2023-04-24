public class Main {
    public static void message(int count){
        System.out.println(count);
        if(count!=5){
            message(count+1);
        }
    }
    public static void main(String[] args) {
        int count=1;
        message(count);
    }
}
