package addtwonumbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void addTwoNumbers_1() {
        AddTwoNumbers.ListNode listNode1_1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode listNode1_2 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode listNode1_3 = new AddTwoNumbers.ListNode(3);

        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;

        AddTwoNumbers.ListNode listNode2_1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode listNode2_2 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode listNode2_3 = new AddTwoNumbers.ListNode(4);

        listNode2_1.next = listNode2_2;
        listNode2_2.next = listNode2_3;

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1_1, listNode2_1);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    public void addTwoNumbers_2() {
        AddTwoNumbers.ListNode listNode1_1 = new AddTwoNumbers.ListNode(5);

        AddTwoNumbers.ListNode listNode2_1 = new AddTwoNumbers.ListNode(5);


        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1_1, listNode2_1);

        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    public void addTwoNumbers_3() {
        AddTwoNumbers.ListNode listNode1_1 = new AddTwoNumbers.ListNode(1);

        listNode1_1.next = new AddTwoNumbers.ListNode(8);

        AddTwoNumbers.ListNode listNode2_1 = new AddTwoNumbers.ListNode(0);

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1_1, listNode2_1);

        assertEquals(1, result.val);
        assertEquals(8, result.next.val);
    }
}
