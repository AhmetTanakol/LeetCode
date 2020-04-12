package laststoneweight;

/*
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)



Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.


Note:

1 <= stones.length <= 30
1 <= stones[i] <= 1000
 */
public class LastStoneWeigth {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }

        MaxNum firstMax = new MaxNum(0, 0);
        MaxNum secondMax = new MaxNum(0, 0);
        for (int i = 0; i < stones.length; i++) {
            if (i == 0) {
                firstMax.val = stones[i];
                firstMax.index = i;
            } else {
                if (stones[i] >= firstMax.val) {
                    secondMax.val = firstMax.val;
                    secondMax.index = firstMax.index;
                    firstMax.val = stones[i];
                    firstMax.index = i;
                } else {
                    if (stones[i] >= secondMax.val) {
                        secondMax.val = stones[i];
                        secondMax.index = i;
                    }
                }
            }
        }
        int newStone = firstMax.val - secondMax.val;
        int newLength = newStone > 0 ? stones.length - 1 : stones.length - 2;
        int[] newStones = new int[newLength];
        int counter = 0;
        for (int i = 0; i < stones.length; i++) {
            if (i == firstMax.index || i == secondMax.index) {
                continue;
            }
            newStones[counter] = stones[i];
            counter++;
        }
        if (newStone > 0) {
            newStones[counter] = newStone;
        }

        return lastStoneWeight(newStones);
    }

    public static class MaxNum {
        int val;
        int index;

        public MaxNum(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
}
