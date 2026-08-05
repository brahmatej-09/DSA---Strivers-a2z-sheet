package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(climbStairs(n));
    }
    static int solve(int start,int end,int[] dp) {
        if(start==end) return 1;
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        return dp[start] = solve(start+1,end,dp) + solve(start+2,end,dp);
    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,dp);
    }
}
