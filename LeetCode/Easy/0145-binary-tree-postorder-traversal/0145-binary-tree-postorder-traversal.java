/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;
    }
    public static void postorder(TreeNode r,List l){
        if(r==null){
            return;
        }
       
        postorder(r.left,l);
        postorder(r.right,l);
        l.add(r.val);
    }
}