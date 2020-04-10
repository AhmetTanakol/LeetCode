package MinStack;

import java.util.ArrayList;
import java.util.List;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

Your MinStack object will be instantiated and called as such:
MinStack obj = new MinStack();
obj.push(x);
obj.pop();
int param_3 = obj.top();
int param_4 = obj.getMin();
 */
public class MinStack {

    private List<Node> nums;

    public MinStack() {
        nums = new ArrayList<>();
    }

    public void push(int x) {
        if (nums.size() == 0) {
            nums.add(new Node(x, x));
        } else {
            Node prevNode = nums.get(nums.size() - 1);
            if (prevNode.min < x) {
                nums.add(new Node(x, prevNode.min));
            } else {
                nums.add(new Node(x, x));
            }
        }
    }

    public void pop() {
        if (!nums.isEmpty()) {
            nums.remove(nums.size() - 1);
        }
    }

    public int top() {
        return nums.get(nums.size() - 1).val;
    }

    public int getMin() {
        return nums.get(nums.size() - 1).min;
    }

    private static class Node {
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

}
