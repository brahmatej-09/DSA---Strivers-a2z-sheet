package Binary_Tress;
import java.util.*;
public class Identical_Or_Not {
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        boolean l = isSameTree(p.left,q.left);
        boolean r = isSameTree(p.right,q.right);
        return (l && r);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        TreeNode root1 = buildTree(arr1);
        TreeNode root2 = buildTree(arr1);
        boolean ans = isSameTree(root1,root2);
        System.out.println(ans);
    }
}
