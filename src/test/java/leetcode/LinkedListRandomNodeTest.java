package leetcode;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;


/**
 * Created by bill33 on 2016/8/15.
 */
public class LinkedListRandomNodeTest {

    @Test
    public void testGetRandom() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        LinkedListRandomNode target = new LinkedListRandomNode(head);
        int actual = target.getRandom();
        System.out.println(actual);
        assertThat(actual, anyOf(is(1), is(2), is(3)));
    }
}