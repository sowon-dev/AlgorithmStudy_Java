package leetcodeEasyLevel;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution sol = new Solution();

        //test cases
        sol.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),new ListNode(1, new ListNode(3, new ListNode(4))));
        //sol.mergeTwoLists(new ListNode(),new ListNode());
        //sol.mergeTwoLists(new ListNode(),new ListNode(0));

        System.out.println("답: "+sol.toString());
    }
}

//leetcode 제출
class Solution {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        System.out.println("l1은 "+l1);
        System.out.println("l2는 "+l2);
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
