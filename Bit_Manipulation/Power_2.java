package Bit_Manipulation;

import java.util.*;

public class Power_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           boolean ans = (n>0 && (n &(n-1))==0);
           System.out.println(ans);
           sc.close();
    }
}
