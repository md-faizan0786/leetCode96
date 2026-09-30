
public class Solution96 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode temp = root;

        while(temp != null) {
            if(temp.val == val) {
                break;
            } else if(temp.val > val) {
                temp = temp.left;
            } else{
                temp = temp.right;
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        Solution96 solution = new Solution96();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;
        TreeNode result = solution.searchBST(root, val);
        if (result != null) {
            System.out.println("Found node with value: " + result.val);
        } else {
            System.out.println("Node with value " + val + " not found.");
        }
    }
}
