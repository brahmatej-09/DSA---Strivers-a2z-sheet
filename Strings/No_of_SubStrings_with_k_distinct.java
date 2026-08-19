package Strings;
import java.util.*;
public class No_of_SubStrings_with_k_distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> ans = new ArrayList<>();
        count(s,ans,k);
        //doesn't collect all
        count2(s,ans,k);
        for(String str : ans) {
            System.out.print(str+" ");
        }
        sc.close();
    }
    static void count(String s,List<String> ans,int k) {
        for(int i=0;i<s.length();i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++) {
                set.add(s.charAt(j));
                if(set.size()==k) {
                    String aa = s.substring(i,j+1);
                    if(!ans.contains(aa)) ans.add(aa);
                }
                else if(set.size()>k) break;
            }
        }
        return;
    }
    static void count2(String s,List<String> ans,int k) {
        int i = 0;
        int j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()) {
            if(map.containsKey(s.charAt(j))) {
                int freq = map.get(s.charAt(j));
                map.put(s.charAt(j),freq+1);
            }
            else map.put(s.charAt(j),1);
           
            if(map.size()>k) {
                while(map.size()>k) {
                    int freq = map.get(s.charAt(i));
                    if(freq == 1) {
                        map.remove(s.charAt(i));
                    }
                    else {
                        map.put(s.charAt(i),freq-1);
                    }
                    i++;
                }
            }
             if(map.size()==k) {
                ans.add(s.substring(i,j+1));
            }
            j++;
        }
        return;
    }
}
