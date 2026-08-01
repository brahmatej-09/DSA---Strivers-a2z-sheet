package Arrays;
import java.util.*;
public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(first_max<arr[i]) {
                second_max = first_max;
                first_max = arr[i];
            }
            else if(second_max<arr[i] && first_max!=arr[i]) {
                second_max = arr[i];
            }
        }
        if(second_max==Integer.MIN_VALUE) {
            System.out.println(-1);
        }
        else System.out.println(second_max);
        sc.close();
    }
}
