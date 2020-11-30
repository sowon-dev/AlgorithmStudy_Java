package leetcodeEasyLevel;

public class MergeTwoSortedLists {

    //leetcode 제출
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    //test cases
    public static void main(String[] args) {

        System.out.println("답: ["+
            //mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),new ListNode(1, new ListNode(3, new ListNode(4))))
            mergeTwoLists(new ListNode(),new ListNode())
            //mergeTwoLists(new ListNode(),new ListNode(0))
        +"]");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {
        //공백을 나타내기 위해서 -1로 정의
        this.val = -1;
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
    @Override
    public String toString() {
        //return "ListNode{" + "val=" + val +", next=" + next + '}';
        if(next == null) return val +"";
        return val +","+ next;
    }
}
