package Strings;
import java.util.*;
public class Rotate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String goal = sc.next();
        sc.close();
        System.out.println(rotateString(str,goal));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String temp = s + s;
        return temp.contains(goal);
    }
}
