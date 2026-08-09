package Binary_Tress;
import java.util.*;
public class PreOrder_Traversal {
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
     public static void preorderTraversal(TreeNode root,List<Integer> list) {
        if(root==null) return;
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
        return;
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
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list); 
        for(int ele : list) {
            System.out.print(ele+" ");
        }
    }
}
