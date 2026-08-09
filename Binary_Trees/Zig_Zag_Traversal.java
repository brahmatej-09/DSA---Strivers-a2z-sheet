package Binary_Trees;
import java.util.*;
public class Zig_Zag_Traversal {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode buildTree(int[] arr) {
        if (arr.length == 0) return null;

        TreeNode[] nodes = new TreeNode[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new TreeNode(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length)
                nodes[i].left = nodes[left];

            if (right < arr.length)
                nodes[i].right = nodes[right];
        }

        return nodes[0];
    }
     static void helper(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null) return;
        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }
        if (level % 2 == 0) {
            ans.get(level).add(root.val);
        } else {
            ans.get(level).add(0, root.val);
        }
        helper(root.left, ans, level + 1);
        helper(root.right, ans, level + 1);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, ans, 0);
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        TreeNode root = buildTree(arr);
        List<List<Integer>> ans =  zigzagLevelOrder(root);
        for(List<Integer> l : ans) {
            for(int ele : l) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
