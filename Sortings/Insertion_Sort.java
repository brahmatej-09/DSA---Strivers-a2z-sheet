package Sortings;
import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        insertion_sort(arr);
        print(arr);
        sc.close();
    }
    static void insertion_sort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            for(int j=i;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele +" ");
    }
}
