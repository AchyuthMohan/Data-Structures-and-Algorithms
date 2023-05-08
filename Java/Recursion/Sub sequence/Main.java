public class Main {
    static void generator(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        generator(up.substring(1), p+ch);
        generator(up.substring(1), p);
    }
    public static void main(String[] args) {
        String s="abc";
        // generator(s, "");
        int nums[]=new int[]{1,2,3};
        for(int num:nums){
            System.out.println(num);
        }
        

    }
}
