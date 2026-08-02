package Arrays;
import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0]+" " + ans[1]);
        sc.close();
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int tar = target - nums[i];
            if(map.containsKey(tar)) {
                ans[0] = map.get(tar);
                ans[1] = i;
                break;
            }
            else {
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
