package Binary_search;
import java.util.*;
public class BS_Upper_Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int target = sc.nextInt();
        System.out.println(upper(arr,target));
        sc.close();
    }
    public static int upper(int[] arr,int target) {
        int n = arr.length;
        int hi = n-1;
        int lo = 0;
        int ans = n;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target) {
                    ans = mid;
                    hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}
