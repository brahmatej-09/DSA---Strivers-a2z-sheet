package Sortings;
import java.util.*;
public class Merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        mergesort(arr);
        print(arr);
        sc.close();
    }
    public static void mergesort(int[] arr) {
            int n = arr.length;
            if(n==1) return;
            int[] a = new int[n/2];
            int[] b = new int[n-n/2];
            for(int i=0;i<a.length;i++) {
                a[i] = arr[i];
            }
            for(int j=0;j<b.length;j++) {
                b[j] = arr[j+n/2];
            }
            mergesort(a);
            mergesort(b);
            merge(a,b,arr);
    } 
    static void merge(int[] a,int[] b,int[] c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) {
                c[k++] = a[i++];
            }
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele +" ");
    }
}
