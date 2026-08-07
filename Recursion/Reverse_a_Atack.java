package Recursion;
import java.util.*;
public class Reverse_a_Atack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            st.push(sc.nextInt());
        }
        sc.close();
        print(st);
        reverse(st);
        print(st);
    }
    static void reverse(Stack<Integer> st) {
    if (st.isEmpty()) return;

    int top = st.pop();
    reverse(st);
    insertAtBottom(st, top);
    }

    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }
    static void print(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0) {
            int num = st.pop();
            System.out.print(num+" ");
            st2.push(num);
        }
        System.out.println();
        while(st2.size()>0) {
            st.push(st2.pop());
        }
    }
}
