package Strings;

import java.util.*;

public class Roman_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = romanToInt(s);
        System.out.println(ans);
        sc.close();
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int num = roman(s.charAt(i));
            int num2 = roman(s.charAt(i + 1));
            if (num >= num2) {
                sum += num;
            } else if (num < num2) {
                sum += (num2 - num);
                i++;
            }
        }
        int v1 = roman(s.charAt(n - 1));
        int v2 = 0;
        if (s.length() > 1) {
            v2 = roman(s.charAt(n - 2));
            if (v2 >= v1) {
                sum += v1;
            }
        } else
            sum = v1;
        return sum;
    }

    static int roman(char ch) {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        else
            return 1000;
    }
}
