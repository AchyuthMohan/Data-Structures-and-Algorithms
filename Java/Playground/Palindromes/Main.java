
import java.util.*;
public class Main {
    static boolean isPalindrome(int n){
        String s=String.valueOf(n);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start value: ");
        n=sc.nextInt();
        System.out.println("Enter the count: ");
        k=sc.nextInt();
        List<Integer>res=new ArrayList<>();
        n=n+1;
        while(k!=0){
            if(isPalindrome(n)){
                k--;
                res.add(n);
            }
            n++;
        }
        System.out.println("Result: ");
        for(int item:res){
            System.out.print(item+" ");
        }
    }
}
