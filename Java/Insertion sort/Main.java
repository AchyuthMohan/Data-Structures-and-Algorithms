import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {
    public static void main(String[] args) {
        int nums[]=new int[]{9,2,3,4,1,5,7};
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int current=nums[i];
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}