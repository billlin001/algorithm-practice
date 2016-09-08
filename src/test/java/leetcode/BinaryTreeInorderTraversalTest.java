package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

//import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/8.
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        BinaryTreeInorderTraversal target = new BinaryTreeInorderTraversal();
        List<Integer> actual = target.inorderTraversal(root);
//        List<Integer> expected = new ArrayList<Integer>(new Integer[]{1, null, 2, 3});

        assertThat(actual, is(contains(1, 3, 2)));
    }
}