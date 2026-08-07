package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class House_Robber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int ans = rob(arr);
        System.out.println(ans);
        sc.close();
    }
    static int solve(int[] nums,int start,int end,int[]dp) {
        if(start>=nums.length || start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        int take = nums[start] + solve(nums,start+2,end,dp);
        int leave = solve(nums,start+1,end,dp);
        return dp[start] = Math.max(take,leave); 
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return  nums[0];
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        int start1 = solve(nums,0,n-2,dp);
        int start2 = solve(nums,1,n-1,dp2);
        return Math.max(start1,start2);
    }
}
