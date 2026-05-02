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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();
        
        pQueue.add(p);
        qQueue.add(q);

        while(!pQueue.isEmpty() && !qQueue.isEmpty()){
            for(int i= pQueue.size(); i > 0; i--){
                TreeNode nodep = pQueue.poll();
                TreeNode nodeq = qQueue.poll();
                if(nodep == null && nodeq == null)
                    continue;
                if(nodep == null || nodeq == null || nodep.val != nodeq.val)
                    return false;
                 pQueue.add(nodep.left);
                 pQueue.add(nodep.right);
                 qQueue.add(nodeq.left);
                 qQueue.add(nodeq.right);

            }

        }
        return true;
    }
}
