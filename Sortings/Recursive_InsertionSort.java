package Sortings;
import java.util.*;
public class Recursive_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        insertion_sort(arr,0,n);
        print(arr);
        sc.close();
    }
    public static void insertion_sort(int[] arr,int i,int n) {
        if(i==n) return;
        for(int k = i;k>0;k--) {
            if(arr[k]<arr[k-1]) {
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k-1] = temp;
            }
            else {
                break;
            }
        }
        insertion_sort(arr, i+1, n);
    }
    static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele +" ");
    }
}
