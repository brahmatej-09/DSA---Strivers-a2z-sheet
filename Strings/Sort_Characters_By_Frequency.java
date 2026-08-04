package Strings;
import java.util.*;
public class Sort_Characters_By_Frequency {
    public static class Pair implements Comparable<Pair> {
        char ch;
        int num;
        Pair(char ch,int num) {
            this.ch = ch;
            this.num = num;
        }
        public int compareTo(Pair p) {
            if(this.num==p.num) return this.ch-p.ch;
            return this.num-p.num;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                int freq = map.get(str.charAt(i));
                map.put(str.charAt(i),freq+1);
            }
            else map.put(str.charAt(i),1);
        }
        Pair[] ans = new Pair[map.size()];
        int idx = 0;
        for(char ch : map.keySet()) {
            ans[idx++] = new Pair(ch, map.get(ch));
        }
        Arrays.sort(ans);
        for(int i=ans.length-1;i>=0;i--) {
            char ch = ans[i].ch;
            System.out.print(ch+" ");
        }
    }
}
