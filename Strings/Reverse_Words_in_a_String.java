package Strings;
import java.util.*;
public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--) {
            sb.append(arr[i]);
            if(i>0)sb.append(" ");
        }
        return sb.toString();
    }
}
