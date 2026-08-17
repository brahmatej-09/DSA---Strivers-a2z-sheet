package Bit_Manipulation;
import java.util.*;
public class check_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if(i>31) System.out.println(false);
        else {
            boolean ans = ((n&(1<<i))!=0);
            System.out.println(ans);
        }
        sc.close();
    }
}
