package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill33 on 2016/9/8.
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        results.addAll(inorderTraversal(root.left));
        results.add(root.val);
        results.addAll(inorderTraversal(root.right));
        return results;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
