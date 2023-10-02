import java.util.*;
public class Main{
    public static void merge(int nums[],int start,int end,int mid){
        int i=start,j=mid+1;
        int k=0;
        int res[]=new int[end-start+1];
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                res[k++]=nums[i++];
            }else{
                res[k++]=nums[j++];
            }
        }
        while(i<=mid){
            res[k++]=nums[i++];
        }
        while(j<=end){
            res[k++]=nums[j++];
        }
        for(int l=0,m=start;l<res.length;l++,m++){
            nums[m]=res[l];
        }
    }
    public static void mergeSort(int nums[],int start,int end){
        if(start>end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);

    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        n=sc.nextInt();
        System.out.println("Enter the size of first array: ");
        m=sc.nextInt();
        int nums1[]=new int[n];
        int nums2[]=new int[m];

        System.out.println("enter the elements of first array: ");
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of second array: ");
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        int res[]=new int[n+m];
        int a=0,b=0;
        int k=0;
        while(a<n && b<m){
            if(nums1[a]<nums2[b]){
                res[k++]=nums1[a++];
            }else{
                res[k++]=nums2[b++];
            }
        }
        for(int i=0;i<(n+m);i++){
            System.out.print(res[i]+" ");
        }
    }
}