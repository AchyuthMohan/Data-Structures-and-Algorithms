public class Main {
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return ch+skipApple(s.substring(1));
        }
    }
    public static void main(String[] args) {
        String s="I have an apple of red colour.";
        System.out.println((skipApple(s)));

    }
}
