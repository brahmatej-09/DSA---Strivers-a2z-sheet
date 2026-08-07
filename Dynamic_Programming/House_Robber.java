package Dynamic_Programming;
import java.util.*;
public class House_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int ans = rob(arr);
        System.out.println(ans);
        sc.close();
    }
    static int solve(int[] nums,int idx,int[] dp) {
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = nums[idx] + solve(nums,idx+2,dp);
        int leave = solve(nums,idx+1,dp);
        return dp[idx] = Math.max(take,leave);
    }
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}
