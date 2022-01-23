public class WhereCycle {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode crush = null;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                if (crush != null && slow == crush)
                    slow = head;
                else
                    slow = slow.next;
                if (slow == fast) {
                    if (slow == crush)
                        return crush;
                    crush = slow;
                }
            }
            return null;
        }
    }
}
