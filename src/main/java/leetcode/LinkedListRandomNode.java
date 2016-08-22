package leetcode;

import java.util.Random;

/**
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 *
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?
 *
 * Example:
 *
 * // Init a singly linked list [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 *
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 * solution.getRandom();
 *
 * @link https://leetcode.com/problems/linked-list-random-node/
 * Created by bill33 on 2016/8/15.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListRandomNode {
    ListNode head;
    Random rnd;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        rnd = new Random();
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int size = getListNodeSize(head);
        int pickNum = rnd.nextInt(size);
        ListNode resultNode = pickNode(head, pickNum);
        return resultNode.val;
    }

    private int getListNodeSize(ListNode head) {
        if(head == null) return 0;
        else return getListNodeSize(head.next) + 1;
    }

    private ListNode pickNode(ListNode head, int pickNum) {
        if(pickNum == 0) return head;
        else return pickNode(head.next, pickNum - 1);
    }
}




/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */