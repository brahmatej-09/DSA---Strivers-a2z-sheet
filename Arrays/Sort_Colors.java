//Sort an array of 0's 1's and 2's
package Arrays;
import java.util.*;
public class Sort_Colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        sortColors(arr);
        sc.close();
    }
    public static void sortColors(int[] arr) {
        int s=arr.length;
        int noof0=0,noof1=0;
        for(int i=0;i<s;i++) {
            if(arr[i]==0) noof0++;
            if(arr[i]==1) noof1++;
        }
        for(int i=0;i<s;i++) {
            if(i<noof0) arr[i]=0;
            else if(i<noof0+noof1) arr[i]=1;
            else arr[i]=2;
        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
