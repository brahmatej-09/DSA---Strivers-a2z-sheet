package Arrays;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }
     public  static int search(int[] arr, int target) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]==target) return mid;
        }
      return -1;
    }
}
