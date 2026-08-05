package Recursion;
import java.util.*;
public class Combination_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        sc.close();
        List<List<Integer>> ans = combinationSum(arr,target);
        for(int i=0;i<ans.size();i++) {
            for(int ele : ans.get(i)) {
                System.out.print(ele +" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(arr,target,ans,list,0);
        return ans;
    }
    static void solve(int[] arr,int target,List<List<Integer>> ans,List<Integer> list,int idx) {
        int n = arr.length;
        if(target==0) {
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<list.size();i++) {
                l.add(list.get(i));
            }
            ans.add(l);
            return;
        }
        for(int i=idx;i<n;i++) {
            if(arr[i]<=target) {
                list.add(arr[i]);
                solve(arr,target-arr[i],ans,list,i);
                list.remove(list.size()-1);
            }
        }
    }
}
