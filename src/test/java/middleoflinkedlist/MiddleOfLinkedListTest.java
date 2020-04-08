package middleoflinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    private MiddleOfLinkedList middleOfLinkedList;

    @Before
    public void setUp() {
        middleOfLinkedList = new MiddleOfLinkedList();
    }

    @Test
    public void middleNode() {
        MiddleOfLinkedList.ListNode listNode = new MiddleOfLinkedList.ListNode(1);
        listNode.next = new MiddleOfLinkedList.ListNode(2);
        listNode.next.next = new MiddleOfLinkedList.ListNode(3);
        listNode.next.next.next = new MiddleOfLinkedList.ListNode(4);
        listNode.next.next.next.next = new MiddleOfLinkedList.ListNode(5);


        MiddleOfLinkedList.ListNode result = middleOfLinkedList.middleNode(listNode);
        assertEquals(3, result.val);
    }
}
