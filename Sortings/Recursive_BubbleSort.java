package Sortings;
import java.util.*;
public class Recursive_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        bubble_sort(arr,n-1);
        print(arr);
        sc.close();
    }
    public static void bubble_sort(int[] arr,int j) {
        if(j<=0) return;
        for(int k = 0;k<j;k++) {
            if(arr[k]>arr[k+1]) {
                int temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp; 
            }
        }
        bubble_sort(arr,j-1);
    }
    static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele +" ");
    }
}
