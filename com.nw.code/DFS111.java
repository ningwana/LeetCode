//给定一个二叉树，找出其最小深度。
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例:
//
// 给定二叉树 [3,9,20,null,null,15,7],
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回它的最小深度 2.
// Related Topics 树 深度优先搜索 广度优先搜索
// 👍 346 👎 0
/*
深度优先搜索：
首先可以想到使用深度优先搜索的方法，遍历整棵树，记录最小深度。
对于每一个非叶子节点，我们只需要分别计算其左右子树的最小叶子节点深度。
这样就将一个大问题转化为了小问题，可以递归地解决该问题。

 */

//leetcode submit region begin(Prohibit modification and deletion)

 // Definition for a binary tree node.
public class DFS111{
static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minDepLength = Integer.MAX_VALUE;
        if (root.left != null) {
            minDepLength = Math.min(minDepth(root.left), minDepLength);
        }
        if (root.right != null) {
            minDepLength = Math.min(minDepth(root.right), minDepLength);
        }
        return minDepLength + 1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
