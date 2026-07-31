package Sortings;
import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        selection_sort(arr);
        print(arr);
        sc.close();
    }
    static void selection_sort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int min = arr[i];
            int minidx = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    minidx = j;
                }
            }
            swap(arr,i,minidx);
        }
        return;
    }
    static void swap(int[] arr,int i,int minidx) {
        int temp = arr[i];
        arr[i] = arr[minidx];
        arr[minidx] = temp;
        return;
    }
    static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele +" ");
    }
}
